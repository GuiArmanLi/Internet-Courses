using System;

class Ex37
{
    static void Main(string[] args)
    {
        int[] vetorA = new int[15] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.Length; i++)
        {
            int fatorial = 1;
            for (int numero = vetorA[i]; numero > 0; numero--)
            {
                fatorial *= numero;
            }
            vetorB[i] = fatorial;
        }

        Console.Write("\nVetor A: ");
        for (int i = 0; i < vetorA.Length; i++)
        {
            Console.Write(vetorA[i] + " ");
        }

        Console.Write("\nVetor B: ");
        for (int i = 0; i < vetorB.Length; i++)
        {
            Console.Write(vetorB[i] + " ");
        }
    }
}