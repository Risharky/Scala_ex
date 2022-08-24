@main def m(args: String*) =
    var i = 0
    while i < args.length do
        println(args(i))
        i += 1
        // agregar los argumentos de esta forma scala programa argumentos todo en la linea de comandos no tiene un input a parte