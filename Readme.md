

## **Tutorial de Programação Orientada a Objetos em Java Banco Digital** 

Para que, tendo um problema , voce seja capaz de apresentar uma solução em Java , utilizando  o paradigma de **Programação Orientada a Objeto** **- POO**  , é preciso seguir uma linha de raciocínio.

Conhecer  a linha de raciocinio permite **irmos de uma situação a ser resolvida até o programa java que implementa as funcionalidades**.  

O objetivo deste atividade é apresentar a estrutura , decisões e técnicas utilizadas na construção de uma solução de um problema de negócio com Java - programa que permita a criação de  Bancos  Digitais, com foco no iniciante em Java e a programação orientada a objeto,**de forma a  entender o caminho a seguir e como as partes se interligam**

A construção  

- Se dará a partir de um codigo simples , o qual  será melhorado a cada introdução de um novo conceito dentro da Orientação a Objeto
- registrado no git hub.  A  **main** conterá o compilado do projeto , e cada branch registrara os passos de cosntrução da solução , considerando os pilares da POO : Abstração / Encapsulamento / Herança / Polimorfismo, e outros pontos importantes do projeto. 
- Premisas : Conhecimento básico de Java e de alguma IDE. 
- Fonte do projeto em java  : Criando um Banco Digital com Java e Orientação a Objetos. Prof. Venilton Favo Jr , Bootcamp Amdosc , Dio.



| Passo | Ação / Conceito                                              |
| :---: | ------------------------------------------------------------ |
|   1   | Entender o problema , ou  domínio onde aplicação ira atuar. Nossa capacidde de construir a solução esta ligada diretamente  no conhecimento que temos do problema |
|   2   | Situação a ser tratada <br />	“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência(entre contas da própria instituição).” |
|   3   | Conceito  ser implantado nos proximos passo<br />***Abstração*** - Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão. |
|   4   | Criar o projeto em sua IDE preferida <br />construi minha versão com o  Intellij, em projeto simples , em Java 11.<br />Como boa prática, coloco codigos em pacotes ( packages), que tem como função organizar os vários códigos dentro dos papeis que cumpre na solução ( classes , interfaces , controles, etc ) |
|   5   | Identificar no dominio , quais são os objetos, atributos e comportamentos do mundo real que vamos precisar implantar em nossa solução, e criar classes java para representar este objetos . Isto é abstrair a solução .<br />Em nosso dominio que um Banco , um *objeto* ou entidade  pode ser uma conta bancaria , esta conta possue como *atributo* o seu numero e agencia , e um *comportamento* esperado é ser possivel abrir conta e efetura deposito na mesma. |
|   6   | Em Java , *objeto*/entidade são representado pelas *classes*, *Atributos* pelas *variaveis* , e o *comportamento* pelo *métodos* . |

7 - Criar a estrutura de classes : Banco , Conta Corrente / Conta Poupança 

```
public class Banco{ }
public class ContaCorrente{ }
public class ContaPoupanca{ }
public class Cliente{ }
```

8 - Definir atributos , ou caracteristicas básicas que cada uma das entidades deve ter ( modelagem ) : 

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

9 - Definir comportamentos que as entidades podem realizar , ou seja , criar metodos . 

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

10 - Conceito a ser implantado nos próximos passos - **Encapsulamento** 

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



11 - **Atributos não devem ser publicos** , por padão em java os atributos devem ser privados ( só a classe em queque foram criados acessa ) .Evita modificações acidentais e/ou erros de difícil identificação . Alterando nas classes . O métodos se mantem publicos pois serão usados para realizar as ações necessárias a partir de outros pontos do programa. 

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



---------------------------------

**Herança**

Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

DRY - Nunca repita voce mesmo - nunca repita um código 

Crio uma classe pai e a classe filha extensa classe pai herda tudo da classe pai

Exemplo :

Classe pai - Conta 

​		atributos da classe pai :  agencia , numero , saldo 

​		métodos da classe pai : sacar , transferir , depositar

Classe filha - Conta Corrente 

​	herda todos os atributos e métodos da classe pai. Falamos que a classe filha extende a clase pai 

​            public class ContaCorrente extends Conta { .... } 

**Interface**

É uma classe abstrata com todos os métodos abstratos  

Classe abstrata solicita alguma implementação que ela sozinha não consegue resolver . Delega a responsabilidade de implementação para a classe que estiver implementando ela .

Classe abstrata não pode ser instanciada. Só que pode instancia-la são as classes filhas . Logo posso tar uma classe como abstrata se não quiser que seja instanciada . Ex. : Não faz sentido ser  instanciada uma conta sem qualificação, precisa ser Conta Corrente ou Conta Poupança .  

Torna mais elegante , define um contrato para a solução . Definir o contrato de uso significa definir os atributos aceitos e mandatórios.  

Todo método em uma interface é publico, não é necessário explicitar como public. 

Faço com que a classe implemente interface criada ( implements ) . 
Exemplo *public abstract class Conta implements iConta { .... }* 

Uso da Interface não é obrigatório mas deixa mais claro as varias opções da entidade 
Exemplo :  No caso de Conta Bancária :  Sacar / Depositar / Transferir / etc .

 



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
