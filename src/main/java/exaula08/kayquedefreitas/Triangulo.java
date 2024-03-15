/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package exaula08.kayquedefreitas;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 15/03/2024
 * @brief Class Triangulo
 */
public class Triangulo extends Figura{
     double base;
     double altura;
    
    public Triangulo(){
    }
    
    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase(double base){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura (double altura){
        this.altura =altura;
    }
    
    @Override
    public double area(){
        return base = altura;
    }
    
    @Override
    public String toString(){
        return "Triangulo [base= " + base + ", altura= " + altura + ", cor= " + super.getCor() + "]";
    }
}
