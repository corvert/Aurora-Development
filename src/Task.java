class CountFrequency
{
    // Function to find counts of all elements present in
    // arr[0..n-1]. The array elements must be range from
    // 1 to n
    void printfrequency(int arr[], int n)
    {
        // Subtract 1 from every element so that the elements
        // become in range from 0 to n-1
        for (int j = 0; j < n; j++)
            arr[j] = arr[j] - 1;

        // Use every element arr[i] as index and add 'n' to
        // element present at arr[i]%n to keep track of count of
        // occurrences of arr[i]
        for (int i = 0; i < n; i++)
            arr[arr[i] % n] = arr[arr[i] % n] + n;

        // To print counts, simply print the number of times n
        // was added at index corresponding to every element
        for (int i = 0; i < 10; i++)
            System.out.println(i + 1 + "->" + arr[i] / n);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        int[] highScores = { 10, 9, 8, 8};
        String[] names = {"Jamal", "Emily", "Destiny", "Mateo"};
// for each loop: for each value in highScores
// for (type variable : arrayname)
        for (int value : highScores)
        {
            // Notice no index or [ ], just the variable value!
            System.out.println( value );
        }
// for each loop with a String array to print each name
// the type for variable name is String!
        for (String name : names)
        {
            System.out.println(name);
        }
    }
}