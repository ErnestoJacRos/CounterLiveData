# App Counter con LiveData usando MVVM
1. instalar las versiones de LifeCycle y adcionalmente se usa shredReferences para almacenar informacion en la memoria cache del dispositivo
2. creamos package counter y dentro cremos otro package view donde creamos individualmente los componenetes visules que ocupamos
   1- toda la pantalla(CounterScreen) 2- los botones(CounterButtons) 3- texto que mostrar el valor(CounterValue)
3. creamos el counterViewModel que es el objetivo de MVVM, utilizar el viewmodel y la razon por la cual instalamos dependencia
   haciendo que la clase cpunterViewModel extienda de ViewModel() y con esto hameos que nuestra aplicacion se conecte a este estado y lo
   este escuhando automaticamente , en esta clase tenemos un objeto de CounterModel que es una clase para manejar nuestra sheredPreference
   lo mas importante es el MutableLiveData() guardada en una varibale llamada _counter que puede ser escucha por medio de un obserbvador
   desde cualquier componente visual y esta varible es una de las 2 varibles , donde _counter es privada y que solo puede ser modifiada desde
   clase y la otra llmada counter que solo sera  visble pero nopdra ser modificada ya que esta representa al MutableLiveData pero esta sera solo
   LiveData que solo es delectura y aqui se aplica el encapsulamiento y tambien tendremos 2 funciones para modificar la primer varibles "_counter" y
   estas funciones llaman al obejeto(_counterModel) de la clase CounterModel y hacer un cambio de valor , toda la logica se hace dentro del modelo(modelo
   se refiere a las tres partes del MVVM que son , model , view y viewmodel) y asi que nuestro viewmodel se encarga de almacenar esta informacion , aun quese puede
   poner logica en el viewmodel lo recomendale que todo la logica del negocio este en model
4. Model: aqui va toda la logica de negocio , aqui tenemos la implementacion de sharedPreferences , se crea la instancia de shredPreferences mandando
   un contexto el cual lo recibimos por parametro, porque para obtener un contexto solo debe ser des una funcion composble, aparte de eso pasamos una clave que
   funciona como un nombre de sharedPreferences para esta aplicacion , una varible que hace referencia al valor de nuestro contador actual
   tambien tenemos un funcion llamada getCurrentValue que retorna un Int, que es el valor actual , y con esto podmeos guardar el estado con que se quedo
   la ultima vez la app 
   
