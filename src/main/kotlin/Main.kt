fun main(args: Array<String>) {
    /*
    Exercício 4

Criarem uma estrutura de when em que consigamos passar um número inteiro entre 1 e 12. O programa precisará, então, retornar o mês referente ao número digitado
     */

    var meses = readLine()!!.toInt()

    when(meses){

        1 ->("Janeiro")
        2 ->("Fevereiro")
        3 ->("Março")
        4 ->("Abril")
        5 ->("Maio")
        6 ->("Junho")
        7 ->("Julho")
        8 ->("Agosto")
        9 ->("Setembro")
        10 ->("Outubro")
        11 ->("Novembro")
        12 ->("Dezembro")
        else -> print("Mês inválido")
    }

}