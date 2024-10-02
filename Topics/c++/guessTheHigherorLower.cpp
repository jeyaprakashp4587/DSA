class Solution
{
public:
    int guessNumber(int n)
    {
        int low = 1, high = n;

        while (low <= high)
        {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            int res = guess(mid);             // Call the provided API

            if (res == 0)
            {
                return mid; // Correct guess
            }
            else if (res == -1)
            {
                high = mid - 1; // Guess is too high, move the high pointer
            }
            else
            {
                low = mid + 1; // Guess is too low, move the low pointer
            }
        }

        return -1; // Should never reach here
    }
};
