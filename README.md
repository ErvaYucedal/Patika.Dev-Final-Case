# Patika.Dev-Final-Case

### HepsiBurada Sitesi <br/>

Bana verilen taskte belirtildiği üzere; 
<br/>HepsiBurada sitesine müşteri girişi yaparak ve yapmayarak ürün seçip iki ayrı satıcıdan sepete ekledim. Ve sepete eklendiğini test ettim.
<br/>
<br/>
HepsiBurada sitesinin testlerini gerçekleştirdiğim bu projede önce manuel testi gerçekleştirdikten sonra
web testi için Java kodlama dilini ve  TestNG framework ile çalıştım. TestNG Framework'unde
OOP kopsepte uyarak POM dizayn modeli kullandım. 
Projeyi yapılandırmak için Maven, versiyon kontrol aracı olarak Git/Github kullandım. 
<br/>
<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="maven" width="100" height="40"/> </a>

<br/>
<br/>

<br/>

<hr/>

## Runner Dosyası <br/>
Runner classında kullandığım notasyonlar sayesinde burda çalıştırabildiğim <b>feature</b>  dosyalarının hem raporlarını alabiliyorum hemde istenilen methodların oluşturulması sağlanabiliyor 

## Screen Dosyası <br/>
Bu dosyada Yanımda mobil uygulamasının testlerini gerçekleştireceğim elementlerin locatelerini sakladığım class bulunmaktadır. 

## StepDefinitons Dosyası <br/>
Step Definitions dosyasında  tüm kodlarımın çalışmasını sağlayan methodlarımın bulunduğu class bulunmakta. Ayrıca ekran görüntüsü almak içinde bu dosyayı kullanıyorum. 
 
### Utilities Dosyası <br/>
Utilies dosyasında sürekli lazım olan classlar ve methodlar bulunuyor. Kod tasarrufuna gitmeyi ve projeyi daha anlaşılır hale getirmeyi sağlıyor. 
<b> ConfigReader.class</b> , <b> Driver.class </b> ,  <b> ReusableMehods.class </b>   dosyaları bulunmaktadır. 

## Resources Dosyası <br/>
<b> feature </b> dosyasının bulunduğu dosyadır.Burda <b>BDD</b> (behavior Driven Development) kullanılarak ve <b> Gherking </b> dili kullanılarak featuremiz oluşturuluyor.Java kodlama dilini bilmeyen kişilerin daha iyi anlamasını sağlamaktadır.

## <b> Configuration.properties </b>
Properties dosyamızda sürekli kullandığımız variablelarımız bulunmakta , bu veriabları kullanmak için properties dosyası <b> Key  =  value </b> olaraka oluşturulmakta ,burdaki bilgileri başaka classlara çağırabilmek için utilities dosyasından
<b> ConfigReader </b> classı çağırırlara içindeki method saysınde bu bosyada bulunan bilgileri istediğimiz yerlere çağırabiliriz.

## pom.xml
Pom.xml dosyasında kullanmak istediğimiz kodların kütüphanesini  <b> dependencies </b> tagının içerisine yerleştirip güncel bilgilerini sürekli olarak kendimizde tutabiliriz.

<hr/>



 





<br/>
