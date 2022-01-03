

## **Tutorial de Programação Orientada a Objetos em Java Banco Digital** 

Para que, tendo um problema , voce seja capaz de apresentar uma solução em Java , utilizando  o paradigma de **Programação Orientada a Objeto** **- POO**  , é preciso seguir uma linha de raciocínio.

Conhecer  a linha de raciocinio permite **irmos de uma situação a ser resolvida até o programa java que implementa as funcionalidades**.  

O objetivo deste atividade é apresentar a estrutura , decisões e técnicas utilizadas na construção de uma solução de um problema de negócio com Java - programa que permita a criação de  Bancos  Digitais, com foco no iniciante em Java e a programação orientada a objeto,**de forma a  entender o caminho a seguir e como as partes se interligam**

A construção  

- Se dará a partir de um codigo simples , o qual  será melhorado a cada introdução de um novo conceito dentro da Orientação a Objeto
- registrado no git hub.  A  **main** conterá o compilado do projeto , e cada branch registra os passos de construção da solução , considerando os pilares da POO : Abstração / Encapsulamento / Herança / Polimorfismo. 
- Premisas : Conhecimento básico de Java e de alguma IDE. 
- Fonte do projeto em java  : Criando um Banco Digital com Java e Orientação a Objetos. Prof. Venilton Favo Jr , Bootcamp Amdosc , Dio.



| Passo | Ação / Conceito                                              |
| :---: | ------------------------------------------------------------ |
| **1** | Entender o problema , ou  domínio onde aplicação ira atuar. Nossa capacidde de construir a solução esta ligada diretamente  no conhecimento que temos do problema |
| **2** | Situação a ser tratada <br />	“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência(entre contas da própria instituição).” |
| **3** | Conceito  ser implantado nos proximos passo<br />***Abstração*** - Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão. |
| **4** | Criar o projeto em sua IDE preferida <br />construi minha versão com o  Intellij, em projeto simples , em Java 11.<br />Como boa prática, coloco codigos em pacotes ( packages), que tem como função organizar os vários códigos dentro dos papeis que cumpre na solução ( classes , interfaces , controles, etc ) |
| **5** | Identificar no dominio , quais são os objetos, atributos e comportamentos do mundo real que vamos precisar implantar em nossa solução, e criar classes java para representar este objetos . Isto é abstrair a solução .<br />Em nosso dominio que um Banco , um *objeto* ou entidade  pode ser uma conta bancaria , esta conta possue como *atributo* o seu numero e agencia , e um *comportamento* esperado é ser possivel abrir conta e efetura deposito na mesma. |
| **6** | Em Java , *objeto*/entidade são representado pelas *classes*, *Atributos* pelas *variaveis* , e o *comportamento* pelo *métodos* . |

**7** - Criar a estrutura de classes : Banco , Conta Corrente / Conta Poupança 

```
public class Banco{ }
public class ContaCorrente{ }
public class ContaPoupanca{ }
public class Cliente{ }
```

**8** - Definir atributos , ou caracteristicas básicas que cada uma das entidades deve ter ( modelagem ) : 

```
public class ContaCorrente{ 
			// atributos
			public  int gencia;   
			public int numero;
			public double saldo;
}

public class ContaPoupanca{  
			// atributos
			public  int gencia;   
			public int numero;
			public double saldo; 
}

public Banco {
	// atributos
	public String nome; 
}

public Cliente {
	// atributos
	public String nome; 
}
```

**9** - Definir comportamentos que as entidades podem realizar , ou seja , criar metodos . 

```
public class ContaCorrente{  
			// atributos
			public  int gencia;   
			public int numero;
			public double saldo;
			
			// comportamentos - métodos 
			public void sacar(){ 
			}
			public void depositar(){ 
			}
			public void transferir(){ 
			}
}

public class ContaPoupanca{  
			// atributos
			public  int gencia;   
			public int numero;
			public double saldo; 
			
			// comportamentos - métodos 
			public void sacar(){ 
			}
			public void depositar(){ 
			}
			public void transferir(){ 
			}
}

public Banco {
	// atributos
	public String nome; 
}

public Cliente {
	// atributos
	public String nome; 
}
```

**10** - Conceito a ser implantado nos próximos passos - **Encapsulamento** 

```
Encapsular significa esconder a implementação dos objetos, que não fazem sentido serem expostas, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

A essencia do encapsulamento - definir uma interface de uso de forma coesa e simples. Não expor mais que o necessário, não externalizar tudo que tenho.

A inteface deve ser simples , direta e FUNCIONAL.
Exemplo de um inteface : Controle remoto da TV . Deve permitir  de maneira fácil e rápida escolher canal , aumenta som, dar pause , colocar em mudo. O que ocorre para tudo isto ocorra fica encapsulado dentro deu controle e da TV , o usuario não precisa e não deve acessar . 

 Encapsulamneto não é somente get e set (metodos de acesso e atribuição), é construir um inteface que faça sentido dentro do que esta sendo modelado
 
Outro exemplo usando os get (obter) e set (ajustar)
			Expor uso ->  set - permite alterar - botão de volume do controle remoto.
													Coloco o volume que quero
			nao expor uso ->    get - Permite somente obter a informação - 
													botão de programação do controle remoto
													Só consigo visualizar a programação , mas não altera-la
```



**11** - **Atributos não devem ser publicos** , por padão em java os atributos devem ser privados ( só a classe em que  foram criados acessa ) .Evita modificações acidentais e/ou erros de difícil identificação . Alterando nas classes . O métodos se mantem publicos pois serão as interfaces de uso  para realizar as ações necessárias ( sacar / depositar / transferir )

```
public class ContaCorrente{  
			// atributos
			private  int gencia;   
			private int numero;
			private double saldo;
			

			// comportamentos - métodos 
			public void sacar(){ 
			}
			public void depositar(){ 
			}
			public void transferir(){ 
			}

}

public class ContaPoupanca{  
			// atributos
			private  int gencia;   
			private int numero;
			private double saldo; 
			

			// comportamentos - métodos 
			public void sacar(){ 
			}
			public void depositar(){ 
			}
			public void transferir(){ 
			}

}

public Banco {
	// atributos
	private String nome; 
}

public Cliente {
	// atributos
	private String nome; 
}


```

**12** - Definir quando cada atributo pode ser alterado. O que vai poder ser ajustado somente em momentos espeficíficos, e o que poderia alterar a qualquer momento pelo usuário em uma interface . 

**13** - Em conta corrente e de poupança,a principio não tem lógica de negócio, alguem de fora ficar alterando  seus atributos . Assim vamos disponibilzar somente neste momento os Get ( obter a informação  )

**Conta e numero** , só será fornecida no ato da abertura da conta

**Saldo** poderá ser alterado a qualquer  dentro de regra mais rígidas . 

Lembrando encapsulamento tem haver com a classe de uso/instancia  do objeto 

```
public class ContaCorrente {
    // atributos
    private  int gencia;
    private int numero;
    private double saldo;

    // comportamentos - métodos
    public void sacar(){
    }
    public void depositar(){
    }
    public void transferir(){
    }
    
    // expor acesso - getters
    // sem expor os modificadores ( setters ) 

    public int getGencia() {
        return gencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
```

```
public class ContaPoupanca {
    // atributos
    private  int gencia;
    private int numero;
    private double saldo;

    // comportamentos - métodos
    public void sacar(){
    }
    public void depositar(){
    }
    public void transferir(){
    }

    // expor acesso - getters
    // sem expor os modificadores ( setters )


    public int getGencia() {
        return gencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
```



**14** - Para Banco e Cliente , neste momento vamos expor tanto a possibilidade de obter o valor atual do atributo  ( get ) , quanto a possibilidade  de ajustar os atributos ( set ) 

```
public class Banco {
    // atributos
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

```
public class Cliente {
    // atributos
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```



**15** - Conceito a ser implantado nos próximos passos - **Herança** 

```
Conceito que traz em sí a reutilização de código, evitando a duplicação desbecessária de código. Veja como as classes Conta Corrente e Conta Poupança tem códigos repetidos, estruturas identica , sinalinado que poderiamos term uma "super"classe , tambem chamada classe "pai". Herança traz o conceto de DRY ( Do not repat yorself). 

Herança: Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.
```



**16** - Criar a super classe (pai ) **Conta**  , com todas as caracteristicas que tem nas contacorrente / poupança 

```
public class Conta { 
    
    // atributos
    private  int gencia;
    private int numero;
    private double saldo;

    // comportamentos - métodos
    public void sacar(){
    }
    public void depositar(){
    }
    public void transferir(){
    }

    // expor acesso - getters
    // sem expor os modificadores ( setters )

    public int getGencia() {
        return gencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
```



**17** - Fazer com que as classe ContaCorrente e Conta Poupança  herdem as caracteristicas da classe pai Conta. 

Classe pai - Conta
					atributos da classe pai :  agencia , numero , saldo
					métodos da classe pai : sacar , transferir , depositar

​	Classe filha - Conta Corrente
​					herda todos os atributos e métodos da classe pai. 

​	No java falamos que estas classes filhas (ContaCorente / ContaPoupanca) extendem a classe pai ( Conta ).

```
public class ContaCorrente extends Conta {

}

```

```
public class ContaPoupanca extends Conta {

}
```



**18** - Conceito a ser implantado nos próximos passos -  **Classe Interface** 

```
Uma classe Interface apresenta um modelo de ação a ser mandatoriamente seguido por outras classes / métodos que executem esta ação ou regra de negócio . É uma forma de padronizarmos uma ação e garantirmos sua consistência durante a construção da solução de negócio. 

Recebe o nome de classe Abstrata, pois apresenta o modelo porem sem implementa-lo, cabe a outros objetos/metodos implementa-lo 

Exemplo : Regra de negócio 

1. em todo tipo de conta devo ter opção de enviar dinheiro para outra conta - transferir

2. Ao transferir  deve-se obrigatoriamente informar o valor a ser transferido 

   Dado a regra , cabe a cada funcionário ( método / classe) que movimentar uma conta cumprir e operacionalizar a regra. 

A **interface** é um recurso muito utilizado em **Java**, bem como na maioria das linguagens orientadas a objeto, para “obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente.

Exemplo : 
	A transferencia  em conta corrente pode ser diferente da transferencia em conta poupança, porem ambas obrigatoriamente devem ter  alguma forma de transferencia, pois a regra de negócio assim determina. 

Usar classe  tipo Interface não é mandatório , mas, torna mais elegante , define um contrato para a solução . Definir o contrato de uso significa definir os atributos aceitos e mandatório, alem de  deixar mais claro as varias opções da entidade / objeto. 
		Exemplo :  No caso de Conta Bancária :  Sacar / Depositar / Transferir / etc .
```



**19** - Criar uma classe tipo interface -iConta . 

<font size="2">nota : Ao solicitar a criação uma nova classe , as IDEs disponibilizam um "lista de tipos" de classe , escolha "interface ".    </font>

```
public interface iConta {
}
```



**20** - Trazer os métodos da classe Conta pra iConta 

<font size="2">os métodos não terão corpo ( ações a realizar ).Todo método em uma classe interface é publico, não é necessário explicitar como public.</font>

```
public interface iConta {

    void sacar();
    void depositar();
    void transferir();
    
}
```



**21** - Definir o contrato das interface  . Apresenta a "assinatura de métodos" , ou os atributos a serem manuseados em cada método , e  que outros classes/métodos  terão que respeitar.

```
public interface iConta {
	
		// assinatura de sacar e depositar -> tem que ser indicado o valor a ser movimentado 
    void sacar( Double valor);
    void depositar(Double valor);
    
    // assinatura de transferir -> tem que ser indicado o valor a ser movimentado
    // e para qual conta 
    void transferir( Conta contaDestino, Double valor);
    
}
```



**22** - Fazer com qua a classe **Conta** se ligue a classe **iConta** , e cumpra as regras da classe interface. Isto é feito informando que Conta **implementa** iConta

```
public class Conta implements iConta {
        // atributos
        private  int gencia;
        private int numero;
        private double saldo;

         // expor acesso - getters
        // sem expor os modificadores ( setters )

        public int getGencia() {
            return gencia;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

}
```



**23** - Implementar os métodos na Classe conta - I 

Classe abstrata define as implementações, mas não a implementa, só apresenta a regra .  Delega a responsabilidade de implementação para a classe que estiver implementando ela .Mas apresenta a assinatura de métodos que as classes terão que respeitar. 

Assim apos informar que  Conta implementa iConta as IDEs informam que há um  erro na "Conta" , pois esta faltando algo , a implentação das regras dadas pela classe interface . 

<font size="2">Nota: As IDEs marcam isto , normalmente com uma anotação em vermelho na classe que implementa a interface, e fornecem meio automatico de criar os metodosa serem implantados. Voce não recisa necessáriamente digitar os métodos . </font> 

![faltaImplements](https://tva1.sinaimg.cn/large/008i3skNgy1gy0og1fleuj30ag01ldfp.jpg)



**24** - Implementar os métodos na classe Conta - II 

Neste momento "criamos" ou implementamos os  métodos na Conta . Em um proximo passo vamos codificar estes métodos . 

<font size="2">  @Override indica que voce sobrescrevendo um método que está sendo herdado, neste caso da classe  interface iConta, ou seja a classe Conta neste momento é filha da classe iConta, e como "filha"vai cumprir as regras do "pai". </font>

```
public class Conta implements iConta {
        // atributos
        private  int agencia;
        private int numero;
        private double saldo;

         // expor acesso - getters
        // sem expor os modificadores ( setters )

        public int getAgencia() {
            return gencia;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

    @Override
    public void sacar(Double valor) {
        
    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {

    }
}
```



**25** - Uma camada a mais de segurança e encapsulamento - Transformar  a classe "Conta" em Abstata , por questão estratégica. 

Tornar a classe Conta abstrata , garanto que ninguem a instancie diretamente ( classe abstrata não pode ser instanciada) .

Como a conta precisa ser ou corrente ou poupança , ao tornar Conta classe abstrata , garantimos que não será possivel instanciar/criar diretamente pela classe Conta , somente por suas filhas , contaCorrente, contaPoupança . 

Para isto classifique como "public abstract class". 

```
public abstract class Conta implements iConta {
....
}
```













notas a serem utilizadas 

---------------------------------

**Polimorfismo**

Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.



Manipular um objeto da forma mais conveniente a voce . Posso trata como conta ou conta corrente o que fizer mais lógica no momento . Se estou usando um método genérico que esta em conta ou algo especifico que esta em CC.  Conta conta = new Contacorrente()


Muda a forma de referenciar , *<u>não muda o objeto</u>* … 

Usar a hierarquia / diversidade de tipos a seu favor .



**Modificadores**
	public - geral. Todo projeto enxerga
	default - somente dentro do mesmo pacote 
	private - somente  a classe acessa 
	protected -  so que herda , enxerga 
