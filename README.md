"Bsale Test Full Stack Nicolas Martinez" 

Back end que genera una API REST, desarrollada en JAVA, junto con Spring y Spring Boot, para agilizar el desarrollo.

Se Genera modelo de datos desde la bbdd entrega por bsale, se disponibilizan las siguientes rutas:
   <ul> 
    <li>Lista de todos los productos: <a href="http://backendtestbsale-env.eba-hushf4i9.us-east-1.elasticbeanstalk.com/api/products/">/api/products/</a></li>
    <li>Producto en Detalle: <a href="http://backendtestbsale-env.eba-hushf4i9.us-east-1.elasticbeanstalk.com/api/product/5">/api/product/${id}</a></li>
    <li>Listado de Categorias: <a href="http://backendtestbsale-env.eba-hushf4i9.us-east-1.elasticbeanstalk.com/api/categories/">/api/categories/</a></li>
    <li>Listado de Productos segun categoria indicada: <a href="http://backendtestbsale-env.eba-hushf4i9.us-east-1.elasticbeanstalk.com/api/categories/1">/api/categories/${id}</a></li>
   </ul>
 Las respuesta otorgadas por la Aplicacion REST, nos devuelven una estructura de tipo Json, como vemos a continuacion:
 
 ![image](https://user-images.githubusercontent.com/75447311/178130472-b751e713-129b-4ee0-847f-7daa5fff16cc.png)

   
  El deploy de la aplicacion se realizo sobre el servicio de Amazon Web Services, sobre un Sistema Elastic Beanstalk, con configuraciones predeterminadas sin certificado SSl.
  Por lo que puede presentar problemas de sitios seguros en algunos navegadores, para no presentar inconvenientes se sugiere, la habilitacion de contenido no seguro en el navegador <a href="https://support.google.com/chrome/answer/114662?hl=es&co=GENIE.Platform%3DDesktop">Revisar este Link</a>
 
Como punto final adjunto link de deploy de la app: <a href="http://backendtestbsale-env.eba-hushf4i9.us-east-1.elasticbeanstalk.com/">http://backendtestbsale-env.eba-hushf4i9.us-east-1.elasticbeanstalk.com/</a>
Ingresamos a /api/products con las rutas indicadas arriba para ver el contexto.
  
