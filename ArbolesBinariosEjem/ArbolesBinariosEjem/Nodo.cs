using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArbolesBinariosEjem
{
    internal class Nodo
    {
        public int Valor;
        private Nodo? izquierda;
        private Nodo? derecha;

        public Nodo? Izquierda
        {
            get { return izquierda; }
            set { izquierda = value; }
        } 

        public Nodo? Derecha
        {
            get { return derecha; }
            set { derecha = value; }
        }

        public Nodo (int  valor)
        {
            Valor = valor; 
        }
    }
}
