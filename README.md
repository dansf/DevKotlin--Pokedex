<h2 align="center">
    Pokedex - Kotlin🕹️
</h2>

### Projeto em Flutter:

Link: [https://github.com/dansf/Flutter--Pokedex](https://github.com/dansf/Flutter--Pokedex)

#### Descrição:

Projeto desenvolvido em Kotlin para a matéria de Desenvolvimento Mobile.

Foi utilizado TextView, Imagens e persistência de dados.

Esse projeto foi feito para todos que querem ter um Pokedex no celular e poder ver os pokemons nela.

#### Estrutura do projeto:

![image](https://user-images.githubusercontent.com/63010902/145922680-0e4b099f-16dd-4ff9-b244-d91c3ad755af.png)

#### Códigos android
**RecyclerView:** é o ViewGroup que contém as visualizações correspondentes aos seus dados.

**ViewGroup:** é um tipo especial de visualização que é estendido de View como sua classe base. ViewGroup é a classe base dos layouts, como o nome indica, o modo de exibição é singular e o grupo de modos de exibição é o ViewGroup.

![image](https://user-images.githubusercontent.com/63010902/146097278-c88b8c29-1910-406f-9025-8ff5958d10da.png)

**ViewModelProvider:**  que criará ViewModels por meio do construtor, Factory.

**ViewModel:** foi projetada para armazenar e gerenciar dados relacionados à IU. A classe ViewModel permite que os dados sobrevivam às mudanças de configuração, como a rotação da tela.

  ![image](https://user-images.githubusercontent.com/63010902/146096993-ef3c6c1a-180c-4cd0-a34e-fccee62cee5f.png)

#### Retrofit:
É a API que faz requisição HTTP por meio de uma interface java. Com `init`, que funciona como um construtor, ela recebe a url da API (de pokemons) junto com o Gson, no qual, através do `GsonCreateFactory.create()`, o Json da API dos pokemons é mapeada para objetos Java e por fim o build() cria a instância do Retrofit, ou seja, a instância da requisição HTTP.

![image](https://user-images.githubusercontent.com/63010902/145925786-2a027864-556d-4de2-9e9d-b648c3af4f48.png)

#### Glide:
O Glide carrega imagens da internet focado na performance de carregamento e na suavidade da imagens nos aplicativos.

A imagem abaixo mostra na `linha 48` o carregamento das imagens dos pokemons.

![image](https://user-images.githubusercontent.com/63010902/146102858-cd47e0ba-3aef-45b9-935f-15c2a7b10603.png)

#### Gson:
Gson é uma biblioteca Java de código aberto para serializar e desserializar objetos Java para JSON.

![image](https://user-images.githubusercontent.com/63010902/146103511-3ad71453-9a12-43fe-a19d-b72c46bbb98d.png)

#### Gif 👾
<img src="https://user-images.githubusercontent.com/63010902/143248749-7c10c769-ebb8-425d-a04b-163362281560.gif" alt="gif" style="zoom:80%;" />

#### APIs

- **Retrofit** - Retorna uma requisição HTTP através de uma interface Java,

- **Glide** - Carregar imagens da internet,

- **Gson** - Gson é uma biblioteca Java de código aberto para serializar e desserializar objetos Java para JSON,

- **PokemonAPI** - API para listar os pokemons

#### Desenvolvedor:
[Daniel](https://github.com/dansf) 👽

