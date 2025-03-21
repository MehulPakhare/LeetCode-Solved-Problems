class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        // Map each recipe to its list of ingredients
        Map<String, String[]> recipeMap = new HashMap<>();
        for (int i = 0; i < recipes.length; i++) {
            List<String> ingList = ingredients.get(i);
            // Convert List to array as per the requirement: <String, String[]>
            recipeMap.put(recipes[i], ingList.toArray(new String[0]));
        }
        
        // Use a set to track available supplies (including recipes we can make)
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        List<String> result = new ArrayList<>();
        
        // Use a boolean flag to track if in an iteration at least one recipe was added
        boolean progress = true;
        
        while (progress) {
            progress = false;
            // Iterate over each recipe in the map
            for (String recipe : recipeMap.keySet()) {
                // If recipe is already available, skip it.
                if (available.contains(recipe)) continue;
                
                // Check if all ingredients for this recipe are available.
                String[] reqIngredients = recipeMap.get(recipe);
                boolean canMake = true;
                for (String ing : reqIngredients) {
                    if (!available.contains(ing)) {
                        canMake = false;
                        break;
                    }
                }
                // If we have all required ingredients, mark recipe as available.
                if (canMake) {
                    available.add(recipe);
                    result.add(recipe);
                    progress = true;
                }
            }
        }
        
        return result;
    }
}
