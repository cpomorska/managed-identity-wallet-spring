# [1.0.0-develop.5](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v1.0.0-develop.4...v1.0.0-develop.5) (2024-10-18)


### Bug Fixes

* chart workflows ([3d0fbf9](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3d0fbf9d18be9f3078e9c427a8f3239ae5a67b53))
* compilation error ([90ef524](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/90ef5241d38e678eff5064c2cd5edb0e6fdc1541))
* copy path in docker file ([ad65e01](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ad65e0196d40bea81d600c50170bbf31f988eaf9))
* dependencies addded at individual project level ([60e3a5c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/60e3a5ccf7a77a6efc6428650d9f3091e6002707))
* docker context path ([ce29cb8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ce29cb8287293a88745ec2c9bbb5d938564c568a))
* dockerfile ([234a7a0](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/234a7a05d6839409b1a62a1d15ac3a424cfad20c))
* dockerfile and dockerfile location ([042292f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/042292f1d4ebf6018721af1f748f3598ee619aa9))
* failing test ([a99ca32](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a99ca32e870a328858913f60c3bae28ca1f315dd))
* failing test cases ([e91b6a0](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e91b6a0330b65d09bc24b6c38086d17ee16a761c))
* file copy path in Dockerfile ([7d76b00](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/7d76b0002615720ed2c0a1f0d45e2ca5bef642be))
* modefied the value for the replicas ([14a67e1](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/14a67e1b982569ddf6e3becd8176fc346b5ef731))
* more test added ([e739cdc](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e739cdc6be1cc8c0c9d3cf2dde8b1b2ef0055b22))
* random port added for management url ([6b118b2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6b118b270ff77f93ee26be8de53706ddba9de277))
* revocation service dockerfile ([28796db](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/28796dbe1642d1255f4cfd309ce3332055abf39a))
* sonar issues ([643493d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/643493df5b862bbc1a86b30360706180d78aa19e))
* sonar issues ([b1c5417](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b1c54176cfba899fbcfed32dc1d028cc028e0a68))
* status list changed to 2021 from bitstring ([546908b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/546908b5e13ce4a0695fa5ade42a14a1abb88a2b))
* status list VS as JSON-LD ([65dd812](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/65dd8124787e7897260e720d42b17e61cdb8955c))
* test cases due to revocation client ([02ccd31](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/02ccd3112bbed9ff14f8f487a5df40eaced79eba))
* tests ([df62fcc](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/df62fcc2e5c841a4cfd893d99fad22d90d34e792))
* user added in dockerfile ([44b46ff](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/44b46ff81ae0730946a198fd26de199755f1df77))
* zap scan errors ([074ab2d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/074ab2df61f94776d23b45eebc87220fbd61a0ef))
* zap scan errors ([c162cad](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c162cada45cd0a885d0546214a18a32a7ac41f02))


### Features

* Helm charts for revocation service ([badb46d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/badb46d7d90232d661665a33410c3f11d210a401))
* intial revocation service added ([c173bd4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c173bd4d9902d798d75683247d13c89dda6861d2))
* release workflow added for revocation-service ([f70b345](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f70b3451c357dacd9b63e324efd23018723547f5))
* revoke API, revocation support in issue VC API, wallet-commons module for common classes ([ec8bb00](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ec8bb008746ee901acccc8eaccda3e5793aea775))
* status list VC type set to StatusList2021 ([4429211](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4429211d8b3bcb999b35a268f4fe588b9b28ef20))
* test coverage verification added at root gradle level and javadoc for miw-commons ([6a7cff2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6a7cff2acb846fa9b664b359ec8fc179673df459))

# [1.0.0-develop.4](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v1.0.0-develop.3...v1.0.0-develop.4) (2024-08-09)


* feat(API)!: change API VC/VP default data format from Json to JWT ([233ab68](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/233ab6883012a5523ecaa4e0ad234e775c3e4577))


### BREAKING CHANGES

* All API endpoints that used Verifiable Credentials and -Presentations in JSON format per default are now working with the JWT format by default instead.

Signed-off-by: Dominik Pinsel <dominik.pinsel@mercedes-benz.com>

# [1.0.0-develop.3](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v1.0.0-develop.2...v1.0.0-develop.3) (2024-07-29)


### Features

* remove BaseController, change Principal to Authenticationand unit test cases added ([15425be](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/15425beccd8bbb3560328d7d845766f422e6e4d8))
* test cases added, file header updated and detail log added for security events ([a4fa6cc](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a4fa6cc37d72e57796616fd87716fef059770e76))

# [1.0.0-develop.2](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v1.0.0-develop.1...v1.0.0-develop.2) (2024-07-22)


### Bug Fixes

* updated spring boot and cloud version ([010ecab](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/010ecab904a0ba4e85c3e4b885fbefb2ed6057e6))

# [1.0.0-develop.1](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.6.0-develop.1...v1.0.0-develop.1) (2024-07-18)


* feat(identity-trust)!: update IATP protocol ([e3c5450](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e3c5450fe2e0084f9deee16dff59e228afa40966))


### BREAKING CHANGES

* `/api/presentations/iatp` endpoint now accepts PresentationQueryMessage and returns PresentationResponseMessage objects.

Signed-off-by: Dominik Pinsel <dominik.pinsel@mercedes-benz.com>

# [0.6.0-develop.1](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0...v0.6.0-develop.1) (2024-07-18)


### Bug Fixes

* updated code as per review ([5961854](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5961854ad811615453ea2afff15c1e4955ca450d))
* updated var name ([44af067](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/44af0670f1e87b5ebedf88f66adcde89157d08fa))


### Features

* added new fields in did document ([8a17aec](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8a17aec6ddf330d730df0e9262c88abc2e297e0b))

# [0.5.0](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0...v0.5.0) (2024-07-05)


### Bug Fixes

* .helmdocsignore is not at project root ([a6ceba4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a6ceba41ac9a456f6016ad16afbf423b17126c4a))
* add "y" parameter and remove unused imports ([72b592c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/72b592c0e09d1baef25ffd607a449ce8a9ca6589))
* add asJwt as query param and fix exceptions ([8cbb756](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8cbb756c48f07a90fcdd9e49244e04dae597d03a))
* add asJwt as query param and fix exceptions ([ef961a5](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ef961a54a24b30b4db18203532c4db8a3916c480))
* add asJwt to controllers and services ([050358e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/050358ef1aad0094edadcd678c18ad6a738e4010))
* add asJwt to controllers and services ([b604f3d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b604f3d6f6734ab89df43c1b21bb7221b5b09eb0))
* add copyright to getCredentialsCommand ([2154b7f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/2154b7fd6c61324e1895a26522eb3632686c6b28))
* add exceptions and fix naming ([dba48e2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/dba48e2c9cda6e86500d12be7511ec4d1a48b5ac))
* add exceptions and fix naming ([531d3f7](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/531d3f79e046ad9ff04387299bf70c40b0396560))
* add keyId to createPresentation ([069a7d3](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/069a7d3531f6220239d2a0b42870608a91e55f8d))
* Add missing gradle validation PR [#257](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/257) ([f9acf55](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f9acf55fd7998895f463225eb6a8ed8a621d734b))
* add missing JSON properties ([5330f64](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5330f64dd51669d4bfd337a656c6151512ad915a))
* add test and validation ([b3db3e0](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b3db3e0ce58e028dd42cad9d2072d794dd735413))
* add test and validation ([842e437](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/842e4375ac68567fddcfa648d75d1e98eaa0e0d4))
* add WalletKey for ES256K algorithm to DidDocument ([9eb3294](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9eb3294a9016befe7bcc469552a9266829bcba4b))
* add wiremock ([4aec527](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4aec527b0994be7af5acf6544f74776aa0d9bff7))
* adjust api docs for 'api/token' endpoint ([7190ed1](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/7190ed17880dcd6aeba46a79211c5b6dba1eae08))
* api doc folder structure ([ebd691a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ebd691a8a5c05f26a6aa10b778d4c8be6189a4af))
* api docs ([8e7b796](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8e7b7961faeabd274598adfe346fba62f53f98c2))
* api docs ([760ee94](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/760ee94dbd79fa019a051c9c915fa0a7a8b0968c))
* change context url ([fa9ee4b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fa9ee4bfd9f0aa43c5275fee177603765b67c38b))
* chart file ([8b16023](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8b16023dd1f73a5e8f3f83117ff8b461cbbff4f5))
* chart file ([099fabb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/099fabbbfd0f14dfdd93307895440d4c0dd48abd))
* copyright updated ([9ade90e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9ade90e21e2d705a5bedb1bb04a0c8f07169c7c9))
* copyright updated ([956b6af](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/956b6afb56935e75940cd59d30c8b639c1ec2aa4))
* current tests ([bb0b30c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/bb0b30c672982cfc5aab5abb5389f4e40d1a6bca))
* DAST scan PR [#256](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/256) ([1c1f1fb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1c1f1fb3eacf0e34887ec78acdc4f51464c3f4de))
* did resolver ([d0522f4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d0522f4dc7160a8617abad26ee47b6d60aeb7644))
* direct access to WalletKeyService while signing VC removed ([e264c0f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e264c0f08de30fa5f3064f9a8d67c121419d75ad))
* exception names ([30a60d5](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/30a60d5b0b965b1d75586640d0c606ccab82795a))
* exception names ([61832ed](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/61832ed39414d07a282f1d4c504cbeb262cb0e81))
* exceptions ([fc6c077](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fc6c07759d3f5adc4cd9c8be8684915a0a19f038))
* exceptions ([1b260fa](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1b260fa4732580d51416f667047fdf036090c07a))
* failing test cases ([bf71a1d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/bf71a1dc9d89334bfbbe8c189b331d4841ee37d2))
* ficense header updated ([b2959e6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b2959e69e26346ff94a8dcbb47d60d41dde1c72f))
* fix bug with token re-wrapping ([e047550](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e04755016aecdf6d6ade0eebae065f36ce80d429))
* fix did creation in did document ([c21f7af](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c21f7af470a6db484a63e49df222a1b7132a0a1e))
* fix ES256K signature ([b33f8a6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b33f8a621e7c6429e1c89285b0eefa942e9e8828))
* fix integration test ([d8084ee](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d8084eee8a4b562ce1242af1689791963b277783))
* fix kid parameter ([97437b4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/97437b4ef8c1ca07fd16fdf3321e61b1fcab2db0))
* fix object name ([59ccdb2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/59ccdb2e1b15633d7de442691d851a6a7d134025))
* fix openapi_v001.json ([068462b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/068462b992136aedeeaace966910bbcefc10aad3))
* fix openapi_v001.json ([c30134e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c30134e10c4d2aa8ec91afc8ba2d1c1de9eca87b))
* fix openapi_v001.json ([1910e88](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1910e886dd5aace37e55d00858559c51d5ba7659))
* formatting ([e00620d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e00620d3851853eb846d1578564ec72897b847b3))
* formatting ([697ff85](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/697ff85f6cd682d5beac7a75288dce43525b5e50))
* formatting issue with api json file ([b10fa38](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b10fa38eeae221b48adc6ebdace8ffdf4781bb09))
* get vc as jwt with tests ([4216e0d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4216e0d48f409366bf7fe49111c3a3083e983130))
* javadoc, imports and throws ([af87ecb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/af87ecb3a79fa49577af0aa0da31d22366e48791))
* new build location for upload action ([b6a7656](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b6a76561af20ee675debe9564bf6e5e203fdb705))
* part of tests ([50ba388](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/50ba3883ca2e3f54b34ac0cfb7119e2f58f030f2))
* part of tests ([7f01263](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/7f012635c338cb517231a87c8b91af563a035964))
* possible caching vulnerability in action ([eb2e38f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/eb2e38f6c6650491fcc81b70d1cf6f6fc5a0886f))
* remove new line ([31819c8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/31819c861bcc40f9fa0aa32179ebf1b0dd12a2c1))
* remove new line ([0c5f111](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0c5f11197919b99c2935af074421fb84261c9f93))
* remove try catch ([874e850](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/874e85064fd298b0ff6eaaca90f9a28706e894b0))
* remove try catch ([b840c77](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b840c771a8f8a94dd83a4d03894d5c5b9d08b058))
* revert IssueDismantlerCredentialReqeust.java ([bac5200](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/bac5200b5c60577dbeb60c2f359df50a279ec3b9))
* revert IssueDismantlerCredentialReqeust.java ([14f6195](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/14f6195f980059dade91338e34b638cbdb656142))
* sonar issues ([a7fb417](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a7fb417e694c6199618e1e51e62c53b33c173089))
* STS Token API Response ([78b7dc3](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/78b7dc33d6ddf9fbe5d0aeccf6e540fc3110e1d5))
* test cases ([22e3bb8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/22e3bb831e8cc83fd947a6aef6b687f438cc7e5e))
* Test Cases ([8eda499](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8eda499476604ee14001811df3c01297bd3e7f7a))
* test cases of get VC api ([1430881](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/14308815e8e8a5420d02bb73ffca2a5386e8eee6))
* test for jwt ([0a69f1c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0a69f1c6eccfd71ffb16893a4b6c1a91903888db))
* test for jwt ([8b5180a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8b5180a1956e89dc64228b93ebe1d69ed718ab88))
* update code with the new ssi lib main ([9497d3e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9497d3e27c218800c3bbb06118fe992651a6baf2))
* update code with the new ssi lib main ([3da1eff](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3da1effc24769751d908762d8edc7d1fa2947ef1))
* update helm-docs test action ([99a1e91](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/99a1e91f05010b1dbd5d0b5c734ef703d8b1ef7f))
* update ssi agent lib version ([02b1f5a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/02b1f5a9e4a1c027d54778272def5c167d1b40e6))
* VP test cases ([847f123](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/847f123f0e3dc4679fd0a22ff287d774c894e8f8))
* VP validation tests ([09d337f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/09d337f85f70e1c6514dc111757264330dc2a3ac))


### Features

* adapt request and wallet service ([c911d33](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c911d332579f669f347dcec3399b430e685baaf0))
* add api docs, option asJwt ([9dc628b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9dc628b3ff4812759e9762f984f0406073191e40))
* add domain objects needed by sts infrastructure ([effb480](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/effb4801b8788c9221f6a64b4a71c990d05f3a64))
* add dto objects for sts infrastructure ([103e7f2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/103e7f2100b2613a5ab82038795c9d8f3bf06d02))
* add exceptions for sts infrastructure ([b4bb9b7](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b4bb9b78be41c721e968e1a350bd22920467b8fe))
* add extra transaction ([b694d19](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b694d19b591df8b460ba45351e7936ef24b84331))
* add ignoring version ([1785080](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1785080a7f3585ecf6fcb89cd94d91701c4906b9))
* add JWT verification and extend tests ([d83ce91](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d83ce91b2e04b131ef3a83983bbd79331be6cac9))
* add JWT verification and extend tests ([5ae223d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5ae223d61f23e71bf426d36ea3255f508abd254b))
* add logging of auth failures ([ec60117](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ec60117e68e7e139afb1f1f24179237bae03762c))
* add logic regarding jti info store and check ([6809578](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6809578d208bc0380fa8a34bf119227e12ea1ecd))
* add missing relationships to entities ([56a48eb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/56a48eb6b4eb8a6a451512d772bf4298fce8f4f4))
* add service method, controller, config for scope matching ([4feebd4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4feebd40dabe45e94f73cafcec410c2e51016758))
* add sts properties ([018d9c0](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/018d9c03430ecb15a73e753837a7a838eb7cca81))
* add token endpoint happy-path test ([d6c30bf](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d6c30bff5cec4f31498c512ecf06ed8237741d30))
* added body type to /token endpoint ([6a67c92](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6a67c9266170d77d5161ea38f6e9a8fc76a213ba))
* adding draft for integration test, refactoring ([ce75056](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ce75056a475ce39970de998376a91dcdc95e4065))
* create initial class ([061faa7](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/061faa72591550d3a7a93cd2e492aaf8ace82ec2))
* create initial classes with validation ([fc5db81](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fc5db81092991da9686aa7f7855d30ae4f4e2e83))
* extend 'miw.security' properties ([e982919](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e9829195245780605a97e1cee5d22439c2f44c64))
* implement token endpoint ([4227f3e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4227f3e2d147f71de84e4db6c0540e1e60849078))
* improve filter, add exception handling ([579a5ec](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/579a5ec547d486f04fca4336545cd9f5bb0dc216))
* Merge PR [#252](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/252) ([8cb132b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8cb132b035a60e7137e536a3a451ce314253ff7b))
* Merge PR [#255](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/255) ([a0d9bdf](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a0d9bdfd1246c684156795523d64210fd828925f))
* move src/ to a dedicated sub-project ([45ddd7b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/45ddd7b4a63120801eb638bd64e72821c309a336))
* save dash.jar in the root project for easy re-use ([98747c8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/98747c8357e769259c9ef44b80fe5c469a0d82d0))
* support new algorithm (WIP) ([9dd6f27](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9dd6f27f33311fc4e4467a412a4ee77eff617e18))
* upload miw jar to gh release ([a7d6aa6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a7d6aa66b3468e4975711c72f1cfdbf3055dcd20))
* use a spring validator for SecureTokenRequest ([accc0d2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/accc0d20404852035876cb7cb4ce5ce7b5da6e64))

# [0.5.0-develop.20](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.19...v0.5.0-develop.20) (2024-06-13)


### Bug Fixes

* failing test cases ([bf71a1d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/bf71a1dc9d89334bfbbe8c189b331d4841ee37d2))
* formatting issue with api json file ([b10fa38](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b10fa38eeae221b48adc6ebdace8ffdf4781bb09))
* test cases of get VC api ([1430881](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/14308815e8e8a5420d02bb73ffca2a5386e8eee6))
* VP test cases ([847f123](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/847f123f0e3dc4679fd0a22ff287d774c894e8f8))
* VP validation tests ([09d337f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/09d337f85f70e1c6514dc111757264330dc2a3ac))

# [0.5.0-develop.19](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.18...v0.5.0-develop.19) (2024-06-12)


### Bug Fixes

* .helmdocsignore is not at project root ([a6ceba4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a6ceba41ac9a456f6016ad16afbf423b17126c4a))
* new build location for upload action ([b6a7656](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b6a76561af20ee675debe9564bf6e5e203fdb705))
* update helm-docs test action ([99a1e91](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/99a1e91f05010b1dbd5d0b5c734ef703d8b1ef7f))


### Features

* move src/ to a dedicated sub-project ([45ddd7b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/45ddd7b4a63120801eb638bd64e72821c309a336))
* save dash.jar in the root project for easy re-use ([98747c8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/98747c8357e769259c9ef44b80fe5c469a0d82d0))

# [0.5.0-develop.18](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.17...v0.5.0-develop.18) (2024-06-03)


### Bug Fixes

* chart file ([8b16023](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8b16023dd1f73a5e8f3f83117ff8b461cbbff4f5))
* chart file ([099fabb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/099fabbbfd0f14dfdd93307895440d4c0dd48abd))
* direct access to WalletKeyService while signing VC removed ([e264c0f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e264c0f08de30fa5f3064f9a8d67c121419d75ad))
* ficense header updated ([b2959e6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b2959e69e26346ff94a8dcbb47d60d41dde1c72f))
* javadoc, imports and throws ([af87ecb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/af87ecb3a79fa49577af0aa0da31d22366e48791))
* sonar issues ([a7fb417](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a7fb417e694c6199618e1e51e62c53b33c173089))
* test cases ([22e3bb8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/22e3bb831e8cc83fd947a6aef6b687f438cc7e5e))

# [0.5.0-develop.17](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.16...v0.5.0-develop.17) (2024-05-29)



### Bug Fixes

* api doc folder structure ([ebd691a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ebd691a8a5c05f26a6aa10b778d4c8be6189a4af))

# [0.5.0-develop.16](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.15...v0.5.0-develop.16) (2024-05-28)


### Bug Fixes

* adjust api docs for 'api/token' endpoint ([7190ed1](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/7190ed17880dcd6aeba46a79211c5b6dba1eae08))
* fix openapi_v001.json ([068462b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/068462b992136aedeeaace966910bbcefc10aad3))
* fix openapi_v001.json ([c30134e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c30134e10c4d2aa8ec91afc8ba2d1c1de9eca87b))
* fix openapi_v001.json ([1910e88](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1910e886dd5aace37e55d00858559c51d5ba7659))

# [0.5.0-develop.15](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.14...v0.5.0-develop.15) (2024-05-28)


### Bug Fixes

* add asJwt as query param and fix exceptions ([8cbb756](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8cbb756c48f07a90fcdd9e49244e04dae597d03a))
* add asJwt as query param and fix exceptions ([ef961a5](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ef961a54a24b30b4db18203532c4db8a3916c480))
* add asJwt to controllers and services ([050358e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/050358ef1aad0094edadcd678c18ad6a738e4010))
* add asJwt to controllers and services ([b604f3d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b604f3d6f6734ab89df43c1b21bb7221b5b09eb0))
* add copyright to getCredentialsCommand ([2154b7f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/2154b7fd6c61324e1895a26522eb3632686c6b28))
* add exceptions and fix naming ([dba48e2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/dba48e2c9cda6e86500d12be7511ec4d1a48b5ac))
* add exceptions and fix naming ([531d3f7](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/531d3f79e046ad9ff04387299bf70c40b0396560))
* add keyId to createPresentation ([069a7d3](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/069a7d3531f6220239d2a0b42870608a91e55f8d))
* add test and validation ([b3db3e0](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b3db3e0ce58e028dd42cad9d2072d794dd735413))
* add test and validation ([842e437](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/842e4375ac68567fddcfa648d75d1e98eaa0e0d4))
* add wiremock ([4aec527](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4aec527b0994be7af5acf6544f74776aa0d9bff7))
* api docs ([8e7b796](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8e7b7961faeabd274598adfe346fba62f53f98c2))
* api docs ([760ee94](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/760ee94dbd79fa019a051c9c915fa0a7a8b0968c))
* change context url ([fa9ee4b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fa9ee4bfd9f0aa43c5275fee177603765b67c38b))
* copyright updated ([9ade90e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9ade90e21e2d705a5bedb1bb04a0c8f07169c7c9))
* copyright updated ([956b6af](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/956b6afb56935e75940cd59d30c8b639c1ec2aa4))
* current tests ([bb0b30c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/bb0b30c672982cfc5aab5abb5389f4e40d1a6bca))
* did resolver ([d0522f4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d0522f4dc7160a8617abad26ee47b6d60aeb7644))
* exception names ([30a60d5](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/30a60d5b0b965b1d75586640d0c606ccab82795a))
* exception names ([61832ed](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/61832ed39414d07a282f1d4c504cbeb262cb0e81))
* exceptions ([fc6c077](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fc6c07759d3f5adc4cd9c8be8684915a0a19f038))
* exceptions ([1b260fa](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1b260fa4732580d51416f667047fdf036090c07a))
* formatting ([e00620d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e00620d3851853eb846d1578564ec72897b847b3))
* formatting ([697ff85](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/697ff85f6cd682d5beac7a75288dce43525b5e50))
* get vc as jwt with tests ([4216e0d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4216e0d48f409366bf7fe49111c3a3083e983130))
* part of tests ([50ba388](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/50ba3883ca2e3f54b34ac0cfb7119e2f58f030f2))
* part of tests ([7f01263](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/7f012635c338cb517231a87c8b91af563a035964))
* remove new line ([31819c8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/31819c861bcc40f9fa0aa32179ebf1b0dd12a2c1))
* remove new line ([0c5f111](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0c5f11197919b99c2935af074421fb84261c9f93))
* remove try catch ([874e850](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/874e85064fd298b0ff6eaaca90f9a28706e894b0))
* remove try catch ([b840c77](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b840c771a8f8a94dd83a4d03894d5c5b9d08b058))
* revert IssueDismantlerCredentialReqeust.java ([bac5200](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/bac5200b5c60577dbeb60c2f359df50a279ec3b9))
* revert IssueDismantlerCredentialReqeust.java ([14f6195](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/14f6195f980059dade91338e34b638cbdb656142))
* test for jwt ([0a69f1c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0a69f1c6eccfd71ffb16893a4b6c1a91903888db))
* test for jwt ([8b5180a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8b5180a1956e89dc64228b93ebe1d69ed718ab88))
* update code with the new ssi lib main ([9497d3e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9497d3e27c218800c3bbb06118fe992651a6baf2))
* update code with the new ssi lib main ([3da1eff](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3da1effc24769751d908762d8edc7d1fa2947ef1))
* update ssi agent lib version ([02b1f5a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/02b1f5a9e4a1c027d54778272def5c167d1b40e6))

# [0.5.0-develop.14](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.13...v0.5.0-develop.14) (2024-05-02)


### Bug Fixes

* STS Token API Response ([78b7dc3](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/78b7dc33d6ddf9fbe5d0aeccf6e540fc3110e1d5))
* Test Cases ([8eda499](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8eda499476604ee14001811df3c01297bd3e7f7a))

# [0.5.0-develop.13](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.12...v0.5.0-develop.13) (2024-04-18)


### Bug Fixes

* fix object name ([59ccdb2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/59ccdb2e1b15633d7de442691d851a6a7d134025))


### Features

* added body type to /token endpoint ([6a67c92](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6a67c9266170d77d5161ea38f6e9a8fc76a213ba))

# [0.5.0-develop.12](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.11...v0.5.0-develop.12) (2024-03-25)


### Bug Fixes

* fix did creation in did document ([c21f7af](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c21f7af470a6db484a63e49df222a1b7132a0a1e))


### Features

* adapt request and wallet service ([c911d33](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c911d332579f669f347dcec3399b430e685baaf0))

# [0.5.0-develop.11](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.10...v0.5.0-develop.11) (2024-03-21)


### Bug Fixes

* add "y" parameter and remove unused imports ([72b592c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/72b592c0e09d1baef25ffd607a449ce8a9ca6589))
* add WalletKey for ES256K algorithm to DidDocument ([9eb3294](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9eb3294a9016befe7bcc469552a9266829bcba4b))
* fix ES256K signature ([b33f8a6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b33f8a621e7c6429e1c89285b0eefa942e9e8828))
* fix kid parameter ([97437b4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/97437b4ef8c1ca07fd16fdf3321e61b1fcab2db0))


### Features

* add extra transaction ([b694d19](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b694d19b591df8b460ba45351e7936ef24b84331))
* support new algorithm (WIP) ([9dd6f27](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9dd6f27f33311fc4e4467a412a4ee77eff617e18))

# [0.5.0-develop.10](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.9...v0.5.0-develop.10) (2024-03-08)


### Features

* upload miw jar to gh release ([a7d6aa6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a7d6aa66b3468e4975711c72f1cfdbf3055dcd20))

# [0.5.0-develop.9](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.8...v0.5.0-develop.9) (2024-03-08)


### Features

* add logging of auth failures ([ec60117](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ec60117e68e7e139afb1f1f24179237bae03762c))

# [0.5.0-develop.8](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.7...v0.5.0-develop.8) (2024-03-08)


### Bug Fixes

* possible caching vulnerability in action ([eb2e38f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/eb2e38f6c6650491fcc81b70d1cf6f6fc5a0886f))

# [0.5.0-develop.7](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.6...v0.5.0-develop.7) (2024-03-07)


### Bug Fixes

* fix bug with token re-wrapping ([e047550](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e04755016aecdf6d6ade0eebae065f36ce80d429))


### Features

* add logic regarding jti info store and check ([6809578](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6809578d208bc0380fa8a34bf119227e12ea1ecd))

# [0.5.0-develop.6](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.5...v0.5.0-develop.6) (2024-03-01)


### Features

* add api docs, option asJwt ([9dc628b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/9dc628b3ff4812759e9762f984f0406073191e40))
* add ignoring version ([1785080](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1785080a7f3585ecf6fcb89cd94d91701c4906b9))
* add service method, controller, config for scope matching ([4feebd4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4feebd40dabe45e94f73cafcec410c2e51016758))
* improve filter, add exception handling ([579a5ec](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/579a5ec547d486f04fca4336545cd9f5bb0dc216))

# [0.5.0-develop.5](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.4...v0.5.0-develop.5) (2024-02-27)


### Bug Fixes

* fix integration test ([d8084ee](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d8084eee8a4b562ce1242af1689791963b277783))


### Features

* add JWT verification and extend tests ([d83ce91](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d83ce91b2e04b131ef3a83983bbd79331be6cac9))
* add JWT verification and extend tests ([5ae223d](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5ae223d61f23e71bf426d36ea3255f508abd254b))
* adding draft for integration test, refactoring ([ce75056](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ce75056a475ce39970de998376a91dcdc95e4065))
* create initial class ([061faa7](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/061faa72591550d3a7a93cd2e492aaf8ace82ec2))
* create initial classes with validation ([fc5db81](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fc5db81092991da9686aa7f7855d30ae4f4e2e83))
* Merge PR [#255](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/255) ([a0d9bdf](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a0d9bdfd1246c684156795523d64210fd828925f))

# [0.5.0-develop.4](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.3...v0.5.0-develop.4) (2024-02-23)


### Bug Fixes

* Add missing gradle validation PR [#257](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/257) ([f9acf55](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f9acf55fd7998895f463225eb6a8ed8a621d734b))

# [0.5.0-develop.3](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.2...v0.5.0-develop.3) (2024-02-23)


### Bug Fixes

* DAST scan PR [#256](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/256) ([1c1f1fb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1c1f1fb3eacf0e34887ec78acdc4f51464c3f4de))

# [0.5.0-develop.2](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.5.0-develop.1...v0.5.0-develop.2) (2024-02-22)


### Bug Fixes

* add missing JSON properties ([5330f64](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5330f64dd51669d4bfd337a656c6151512ad915a))


### Features

* add domain objects needed by sts infrastructure ([effb480](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/effb4801b8788c9221f6a64b4a71c990d05f3a64))
* add dto objects for sts infrastructure ([103e7f2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/103e7f2100b2613a5ab82038795c9d8f3bf06d02))
* add exceptions for sts infrastructure ([b4bb9b7](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b4bb9b78be41c721e968e1a350bd22920467b8fe))
* add missing relationships to entities ([56a48eb](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/56a48eb6b4eb8a6a451512d772bf4298fce8f4f4))
* add sts properties ([018d9c0](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/018d9c03430ecb15a73e753837a7a838eb7cca81))
* add token endpoint happy-path test ([d6c30bf](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d6c30bff5cec4f31498c512ecf06ed8237741d30))
* extend 'miw.security' properties ([e982919](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e9829195245780605a97e1cee5d22439c2f44c64))
* implement token endpoint ([4227f3e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4227f3e2d147f71de84e4db6c0540e1e60849078))
* use a spring validator for SecureTokenRequest ([accc0d2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/accc0d20404852035876cb7cb4ce5ce7b5da6e64))

# [0.5.0-develop.1](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0...v0.5.0-develop.1) (2024-02-09)


### Features

* Merge PR [#252](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/252) ([8cb132b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8cb132b035a60e7137e536a3a451ce314253ff7b))

# [0.4.0](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.3.0...v0.4.0) (2024-02-09)


### Bug Fixes

* add a comment to the expiryInstant ([21ac648](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/21ac64813d31d031766cbf3cb6efd8bfc6bcb670))
* add if statement for creating VC ([0092728](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/00927284a50041f210bb66896c9688b89cf8ff49))
* **ci:** update node version to 20 ([263e88b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/263e88b07e6e9bd3846ea8a37e6e8a2c8ede3b04))
* **helm:** minor fixes ([49b5530](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/49b553096fa621429e0df916f61d0e311c7f840a))
* **helm:** use correct value for psql dependency condition ([d8bb09a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d8bb09a97c5a60c902180e4bb1fc54f1801adc72))
* **helm:** use correct value for psql dependency condition PR [#177](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/177) ([f880d9a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f880d9a0536bf7821baa9aa90ac37db614907c0c))
* **helm:** vc expiration date ([e056108](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e056108ed84ae016b3ad348580d4d6d5de7b6322))
* missing helm docs during semantic release PR [#218](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/218) ([afad988](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/afad988253aa4a1bbc59603ce7bf706d0f158fd4))
* **release:** add missing author, committer emails ([6d49d27](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6d49d272b74b1d43cf48584492215f44b90f1bcf))
* **release:** missing helm-docs during semantic release ([8f4d7f4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8f4d7f4cfa2f6d5efb9cc4503c6f3bddf606f691))
* **release:** use correct syntax for github actor ([86976a6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/86976a6e51c828b723722b730dda19547434cffe))
* **validation:** credential signer must be equal issuer ([12abe09](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/12abe0993fab42cc01fa673ea4b01b9773004636))
* wrong helm docs version in ci PR [#219](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/219) ([3f1ed66](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3f1ed6628854900a28ab87d54582a037986ed5c2))
* wrong helm-docs version in pipeline ([f5ba466](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f5ba466329452a8f21cdbe50821652cc6f7c4408))


### Features

* add helm-docs cmd to semantic-release ([ad46396](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ad46396f35a51d7f56e62fbe49b3692e0f69cf50))
* add outputs to workflow environment ([859b748](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/859b7485c973b08039e95407e2372a30774289ff))
* adds VVP Flow to architecture section ([32c5b9c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/32c5b9c4ece4a82fc799405e699ecd281c600e14))
* **chart:** add extra volume/-mounts ([0f6252f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0f6252f8900ba4a5e7b5f6fa2e531274df615a31))
* **helm:** add networkPolicy for miw ([502b633](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/502b633c0ff4f533f36b96a0f10b2eaa5f9e1954))
* **helm:** add pgadmin4 as dependency to the chart ([6c68928](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6c689280f33107268f0789c243db1f3dca561485))
* **helm:** add pgadmin4 as dependency to the chart PR [#208](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/208) ([8c5c32f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8c5c32f4f3d1e1cfd16b7f2e529ad25ca466df2e))
* **helm:** allow networkPolicy to template values ([acddcff](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/acddcffc73e87b9eb9f7b752ca508b8a50058c5d))
* **helm:** configure MIW Helm chart to use pgadmin4 subchart ([fc2f211](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fc2f211abfa7ffedc2e66778c05eb10e3a2df366))
* **helm:** configure MIW Helm chart to use pgadmin4 subchart PR [#209](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/209) ([8d18845](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8d18845ef841b791c13597af0398ee10b752b7e9))
* merge release 0.3.0 from main ([3305d2f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3305d2fe6bc303aebc6ea4b971318a102e60a202))
* upload helm chart asset to GitHub release ([f7a1043](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f7a1043d47b9da19c8030b3e5c16fcb8ee79eccd))

# [0.4.0-develop.17](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.16...v0.4.0-develop.17) (2024-01-30)


### Features

* **helm:** allow networkPolicy to template values ([acddcff](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/acddcffc73e87b9eb9f7b752ca508b8a50058c5d))

# [0.4.0-develop.16](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.15...v0.4.0-develop.16) (2024-01-26)


### Features

* **chart:** add extra volume/-mounts ([0f6252f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0f6252f8900ba4a5e7b5f6fa2e531274df615a31))

# [0.4.0-develop.15](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.14...v0.4.0-develop.15) (2024-01-24)


### Features

* **helm:** add networkPolicy for miw ([502b633](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/502b633c0ff4f533f36b96a0f10b2eaa5f9e1954))

# [0.4.0-develop.14](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.13...v0.4.0-develop.14) (2024-01-18)


### Bug Fixes

* **helm:** vc expiration date ([e056108](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/e056108ed84ae016b3ad348580d4d6d5de7b6322))

# [0.4.0-develop.13](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.12...v0.4.0-develop.13) (2024-01-18)


### Bug Fixes

* **helm:** minor fixes ([49b5530](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/49b553096fa621429e0df916f61d0e311c7f840a))

# [0.4.0-develop.12](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.11...v0.4.0-develop.12) (2024-01-17)


### Bug Fixes

* **validation:** credential signer must be equal issuer ([12abe09](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/12abe0993fab42cc01fa673ea4b01b9773004636))

# [0.4.0-develop.11](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.10...v0.4.0-develop.11) (2024-01-16)


### Bug Fixes

* add a comment to the expiryInstant ([21ac648](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/21ac64813d31d031766cbf3cb6efd8bfc6bcb670))
* add if statement for creating VC ([0092728](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/00927284a50041f210bb66896c9688b89cf8ff49))

# [0.4.0-develop.10](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.9...v0.4.0-develop.10) (2024-01-16)


### Bug Fixes

* **ci:** update node version to 20 ([263e88b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/263e88b07e6e9bd3846ea8a37e6e8a2c8ede3b04))

# [0.4.0-develop.9](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.8...v0.4.0-develop.9) (2024-01-10)


### Bug Fixes

* **release:** add missing author, committer emails ([6d49d27](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6d49d272b74b1d43cf48584492215f44b90f1bcf))
* **release:** use correct syntax for github actor ([86976a6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/86976a6e51c828b723722b730dda19547434cffe))

# [0.4.0-develop.8](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.7...v0.4.0-develop.8) (2024-01-10)


### Features

* add outputs to workflow environment ([859b748](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/859b7485c973b08039e95407e2372a30774289ff))

# [0.4.0-develop.7](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.6...v0.4.0-develop.7) (2023-12-18)


### Features

* upload helm chart asset to GitHub release ([f7a1043](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f7a1043d47b9da19c8030b3e5c16fcb8ee79eccd))

# [0.4.0-develop.6](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.5...v0.4.0-develop.6) (2023-12-15)


### Bug Fixes

* missing helm docs during semantic release PR [#218](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/218) ([afad988](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/afad988253aa4a1bbc59603ce7bf706d0f158fd4))
* **release:** missing helm-docs during semantic release ([8f4d7f4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8f4d7f4cfa2f6d5efb9cc4503c6f3bddf606f691))
* wrong helm docs version in ci PR [#219](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/219) ([3f1ed66](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3f1ed6628854900a28ab87d54582a037986ed5c2))
* wrong helm-docs version in pipeline ([f5ba466](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f5ba466329452a8f21cdbe50821652cc6f7c4408))


### Features

* add helm-docs cmd to semantic-release ([ad46396](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/ad46396f35a51d7f56e62fbe49b3692e0f69cf50))

# [0.4.0-develop.5](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.4...v0.4.0-develop.5) (2023-12-15)


### Features

* adds VVP Flow to architecture section ([32c5b9c](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/32c5b9c4ece4a82fc799405e699ecd281c600e14))

# [0.4.0-develop.4](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.3...v0.4.0-develop.4) (2023-12-15)


### Bug Fixes

* **helm:** use correct value for psql dependency condition ([d8bb09a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d8bb09a97c5a60c902180e4bb1fc54f1801adc72))
* **helm:** use correct value for psql dependency condition PR [#177](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/177) ([f880d9a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/f880d9a0536bf7821baa9aa90ac37db614907c0c))

# [0.4.0-develop.3](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.2...v0.4.0-develop.3) (2023-12-14)


### Features

* **helm:** configure MIW Helm chart to use pgadmin4 subchart ([fc2f211](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fc2f211abfa7ffedc2e66778c05eb10e3a2df366))
* **helm:** configure MIW Helm chart to use pgadmin4 subchart PR [#209](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/209) ([8d18845](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8d18845ef841b791c13597af0398ee10b752b7e9))

# [0.4.0-develop.2](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.4.0-develop.1...v0.4.0-develop.2) (2023-12-13)


### Features

* **helm:** add pgadmin4 as dependency to the chart ([6c68928](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6c689280f33107268f0789c243db1f3dca561485))
* **helm:** add pgadmin4 as dependency to the chart PR [#208](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/208) ([8c5c32f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8c5c32f4f3d1e1cfd16b7f2e529ad25ca466df2e))

# [0.4.0-develop.1](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.3.0...v0.4.0-develop.1) (2023-12-11)


### Features

* merge release 0.3.0 from main ([3305d2f](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3305d2fe6bc303aebc6ea4b971318a102e60a202))

# [0.3.0](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.1...v0.3.0) (2023-12-07)


### Bug Fixes

* **ci:** separate workflow "Test application (test + coverage)" for PR and repo ([6de785b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6de785b670bdede6e55559ce461fb76d05f2ecc8))
* **dev:** add file extension and refactor called method in gradle ([6811a8b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6811a8b025b76f5998b1c2fd65b5f679e28468d3))
* **dev:** add important notes to INSTALL.md ([a7c1b71](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a7c1b711ac402cbead4e10e5c79d6ba318eaacdb))
* **dev:** adjust port to request against keycloak ([4a3d317](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4a3d317363690c78897c5db77a60fc716cd91b42))
* **dev:** small adjustment to INSTALL.md ([59b6df4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/59b6df484bd31905f43d8bc9c83e44f0992839fb))
* manually change the Helm chart version ([1ad16ed](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1ad16ed064d69214bc87d65f76740c2ecaa6b539))
* method name from the cx-ssi-lib has been renamed ([b46d084](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b46d0846f6b9ccc6b439c82ffec783cd8b933e08))
* remove filter for org.eclipse packages ([af9a9e5](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/af9a9e50a9c15b16c8346561bc7ccb87a45df39d))


### Features

* add initContainers ([#142](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/142)) ([7317800](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/731780075ca5e1a707c8834013c4c98348e9c269))
* add tpl to miw ingress ([#143](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/143)) ([c56d133](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c56d1330f2df1a3468c1e680bcc4fe50898ca6bd))
* **dev:** add pgAdmin to local dev env ([#144](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/144)) ([d7f2bbe](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d7f2bbe2900322bb5ecba94aa1ab4fafad5cf21c))
* **devel:** make application port dynamic (parameter) ([8816c89](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8816c899e8aa2170e753f3250c74552d898520c2))
* **dev:** update README.md and introduce INSTALL.md for usage ([54b8d4a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/54b8d4ae9c859db2216ac3f85cbc56ab3cf6b950))
* **helm:** Make liveness & readiness probes configurable ([#99](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/99)) ([252eed1](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/252eed1b15289740ba953861076de86ddc99fe4a))
* **readme:** add "usage" section [WIP] ([6919b71](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6919b71870e9265ae09a66e3354ec43bf7d1d088))

# [0.3.0-develop.3](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.3.0-develop.2...v0.3.0-develop.3) (2023-12-07)


### Reverts

* Revert "Release MIW 0.3.0 (#190)" (#193) ([28978a8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/28978a8139b0bebe064224bfc29fccea795613af)), closes [#190](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/190) [#193](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/193)

# [0.3.0-develop.2](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.3.0-develop.1...v0.3.0-develop.2) (2023-12-07)

## [0.2.1](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0...v0.2.1) (2023-12-07)


### Reverts

* Revert "Release MIW 0.3.0 (#190)" (#193) ([28978a8](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/28978a8139b0bebe064224bfc29fccea795613af)), closes [#190](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/190) [#193](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/193)

# [0.2.0-develop.11](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.10...v0.2.0-develop.11) (2023-12-06)


### Bug Fixes

* remove filter for org.eclipse packages ([af9a9e5](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/af9a9e50a9c15b16c8346561bc7ccb87a45df39d))

# [0.2.0-develop.10](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.9...v0.2.0-develop.10) (2023-12-05)


### Bug Fixes

* manually change the Helm chart version ([1ad16ed](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1ad16ed064d69214bc87d65f76740c2ecaa6b539))

# [0.2.0-develop.9](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.8...v0.2.0-develop.9) (2023-11-30)


### Bug Fixes

* method name from the cx-ssi-lib has been renamed ([b46d084](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/b46d0846f6b9ccc6b439c82ffec783cd8b933e08))

# [0.2.0-develop.8](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.7...v0.2.0-develop.8) (2023-11-28)


### Bug Fixes

* **dev:** add important notes to INSTALL.md ([a7c1b71](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/a7c1b711ac402cbead4e10e5c79d6ba318eaacdb))
* **dev:** adjust port to request against keycloak ([4a3d317](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/4a3d317363690c78897c5db77a60fc716cd91b42))
* **dev:** small adjustment to INSTALL.md ([59b6df4](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/59b6df484bd31905f43d8bc9c83e44f0992839fb))


### Features

* **devel:** make application port dynamic (parameter) ([8816c89](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/8816c899e8aa2170e753f3250c74552d898520c2))
* **dev:** update README.md and introduce INSTALL.md for usage ([54b8d4a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/54b8d4ae9c859db2216ac3f85cbc56ab3cf6b950))
* **readme:** add "usage" section [WIP] ([6919b71](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6919b71870e9265ae09a66e3354ec43bf7d1d088))

# [0.2.0-develop.7](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.6...v0.2.0-develop.7) (2023-11-23)


### Features

* **dev:** add pgAdmin to local dev env ([#144](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/144)) ([d7f2bbe](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/d7f2bbe2900322bb5ecba94aa1ab4fafad5cf21c))

# [0.2.0-develop.6](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.5...v0.2.0-develop.6) (2023-11-23)


### Features

* add initContainers ([#142](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/142)) ([7317800](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/731780075ca5e1a707c8834013c4c98348e9c269))

# [0.2.0-develop.5](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.4...v0.2.0-develop.5) (2023-11-22)


### Features

* **helm:** Make liveness & readiness probes configurable ([#99](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/99)) ([252eed1](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/252eed1b15289740ba953861076de86ddc99fe4a))

# [0.2.0-develop.4](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.3...v0.2.0-develop.4) (2023-11-22)


### Features

* add tpl to miw ingress ([#143](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/143)) ([c56d133](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c56d1330f2df1a3468c1e680bcc4fe50898ca6bd))

# [0.2.0-develop.3](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.2...v0.2.0-develop.3) (2023-11-22)


### Bug Fixes

* **ci:** separate workflow "Test application (test + coverage)" for PR and repo ([6de785b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6de785b670bdede6e55559ce461fb76d05f2ecc8))
* **dev:** add file extension and refactor called method in gradle ([6811a8b](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/6811a8b025b76f5998b1c2fd65b5f679e28468d3))

# [0.2.0](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.1.1...v0.2.0) (2023-10-23)


### Bug Fixes

* CGD-468: Application starts with corrupted data in case of invalid AES key ([c734946](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c734946abfc1c34f1710f74e1329505dafa2fa00))
* **ci:** helm chart release ([c2bd166](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c2bd166f25c4488e1bc0d7bb5215d92602ad9f96))
* missing env variables in release workflow ([#111](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/111)) ([0f99498](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0f9949899eb218e0b3b1b3742c0ea5ee82d19701))
* rate limit during json-ld context loading ([#100](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/100)) ([09d1f1a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/09d1f1a4f5a8a2bbaf7e328efea4ed60d232d778))
* typo in Bearer ([754b90a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/754b90a9fa90a308584949a6bf8085b6b27d8a19))
* Typo in Bearer ([#102](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/102)) ([3765c68](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3765c689fcadc29f663c0521c3b9cc072ee8e779))


### Features

* add Eclipse Copyright header to CHANGELOG.md.jinja ([dd53533](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/dd53533bc6ccb9a160e4c51c46438321ed2b2be7))
* add GH Action workflow to test the app (incl. coverage) ([1e16b04](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1e16b0418825ea402dd4a690d760b367a5c0ce8b))
* BPN validation added in issue dismantler VC ([5a04a2e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5a04a2ef41e48feb42c2db5baa54ea0e54833a3f))
* **ci:** semantic releases from develop branch ([#87](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/87)) ([fda8ee6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fda8ee6ae864aa86823a7ebfdce9702f372a9ded))
* error msg updated ([2b305d2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/2b305d2d488a7ed1c63022ff4241ad5fa588822d))

# [0.2.0-develop.2](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.2.0-develop.1...v0.2.0-develop.2) (2023-10-20)


### Bug Fixes

* **ci:** helm chart release ([c2bd166](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c2bd166f25c4488e1bc0d7bb5215d92602ad9f96))

# [0.2.0-develop.1](https://github.com/eclipse-tractusx/managed-identity-wallet/compare/v0.1.1...v0.2.0-develop.1) (2023-10-18)


### Bug Fixes

* CGD-468: Application starts with corrupted data in case of invalid AES key ([c734946](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/c734946abfc1c34f1710f74e1329505dafa2fa00))
* missing env variables in release workflow ([#111](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/111)) ([0f99498](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/0f9949899eb218e0b3b1b3742c0ea5ee82d19701))
* rate limit during json-ld context loading ([#100](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/100)) ([09d1f1a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/09d1f1a4f5a8a2bbaf7e328efea4ed60d232d778))
* typo in Bearer ([754b90a](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/754b90a9fa90a308584949a6bf8085b6b27d8a19))
* Typo in Bearer ([#102](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/102)) ([3765c68](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/3765c689fcadc29f663c0521c3b9cc072ee8e779))


### Features

* add Eclipse Copyright header to CHANGELOG.md.jinja ([dd53533](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/dd53533bc6ccb9a160e4c51c46438321ed2b2be7))
* add GH Action workflow to test the app (incl. coverage) ([1e16b04](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/1e16b0418825ea402dd4a690d760b367a5c0ce8b))
* BPN validation added in issue dismantler VC ([5a04a2e](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/5a04a2ef41e48feb42c2db5baa54ea0e54833a3f))
* **ci:** semantic releases from develop branch ([#87](https://github.com/eclipse-tractusx/managed-identity-wallet/issues/87)) ([fda8ee6](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/fda8ee6ae864aa86823a7ebfdce9702f372a9ded))
* error msg updated ([2b305d2](https://github.com/eclipse-tractusx/managed-identity-wallet/commit/2b305d2d488a7ed1c63022ff4241ad5fa588822d))

# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/en/1.0.0/)
and this project adheres to [Semantic Versioning](http://semver.org/spec/v2.0.0.html).

<!-- insertion marker -->
## [V0.1.1] - 2023-09-06

### Known Knowns

- By default the role "view_wallets" is exclusively foreseen for the issuer/authority. In case of an unintended
  assignment of this role to any technical user, those are able to see the list of existing wallets with the current
  code version. A suitable fix with a second validation step will be provided with the next update of MIW.

### Security

- update spring-boot to version 3.1.2, updating transitive dependency spring-security-core to 6.1.2 (by Boris Rizov)

## [managed-identity-wallet-0.1.0-rc.3](https://github.com/pmoscode/managed-identity-wallet/releases/tag/managed-identity-wallet-0.1.0-rc.3) - 2023-08-28

<small>[Compare with managed-identity-wallet-0.1.0-rc.2](https://github.com/pmoscode/managed-identity-wallet/compare/managed-identity-wallet-0.1.0-rc.2...managed-identity-wallet-0.1.0-rc.3)</small>

### Features

- adds gradle task to equip 'jar/META-INF/' with 'DEPENDENCIES', 'SECURITY.md', 'NOTICE.md', 'LICENSE' (by Mathias Knoop).

### Bug Fixes

- tests fail randomly because of KeyGenerator (by Boris Rizov).

## [managed-identity-wallet-0.1.0-rc.2](https://github.com/pmoscode/managed-identity-wallet/releases/tag/managed-identity-wallet-0.1.0-rc.2) - 2023-08-25

<small>[Compare with managed-identity-wallet-1.1.0](https://github.com/pmoscode/managed-identity-wallet/compare/managed-identity-wallet-1.1.0...managed-identity-wallet-0.1.0-rc.2)</small>

### Bug Fixes

- remove out-of-date deployment workflow (by Sebastian Bezold).

## [managed-identity-wallet-1.1.0](https://github.com/pmoscode/managed-identity-wallet/releases/tag/managed-identity-wallet-1.1.0) - 2023-08-23

<small>[Compare with first commit](https://github.com/pmoscode/managed-identity-wallet/compare/060340e0f43f6bd2616afc1d3589c12bb1a5ffe6...managed-identity-wallet-1.1.0)</small>

### Features

- did document resolver component changes reverted (by Nitin Vavdiya).
- add docker hub release workflow (by Peter Motzko).
- add trigger on push (by Peter Motzko).
- adds license file 'CC-BY-4.0.tyt' in the corresponding directory 'LICENSES'. (by Mathias Knoop).
- ssi-lib version set to 15 (by Nitin Vavdiya).
- removed endpoint from config file (by Ronak Thacker).
- CGD-444: sql migration added (by Nitin Vavdiya).
- CGD-444-add-random-key-reference-to-did (by Nitin Vavdiya).
- validate issuer bpn while creating new wallet (by Ronak Thacker).
- add --wait to helm install (by Peter Motzko).
- add external chart repos (by Peter Motzko).
- update Chart.lock (by Peter Motzko).
- separate linting and testing and build temporary image to deploy on cluster (by Peter Motzko).
- update deprecated code (by Peter Motzko).
- enable manual trigger (by Peter Motzko).
- encryption key is now always stored in secret (by Dominik Pinsel).
- remove anchors from values.yaml (by Dominik Pinsel).
- generate authority wallet DID out of BPN and host (by Dominik Pinsel).
- set default log level (by Dominik Pinsel).
- set default database encryption key to random value (by Dominik Pinsel).
- set vc expiry date default to end of year (by Dominik Pinsel).
- make chart standalone runnable (by Dominik Pinsel).
- CGD-204: changes related to did document resolver in ssi-lib (by Nitin Vavdiya).
- add healthcheck for use with docker, compose or swarm (by Peter Motzko).
- add documentation for env / secret variables (by Peter Motzko).
- adds overview of roles associated with available endpoints (by Mathias Knoop).
- add documentation for new content and adjust the old one (by Peter Motzko).
- add additional unittests (by Peter Motzko).
- add internal / external postgresql switch (by Peter Motzko).
- adds overview of the required roles per endpoint (by Mathias Knoop).
- add task for generating CHANGELOG.md file (by Peter Motzko).
- add GH Action for DAST scanning (by Peter Motzko).
- update Helm chart Readme and corresponding Readme-template (by Peter Motzko).
- update Helm chart description (by Peter Motzko).
- add helm-docs documentation (by Peter Motzko).
- remove predefined annotation for ingress (by Peter Motzko).
- add one more folder depth to helm unittest in Taskfile (by Peter Motzko).
- add helm values for local deployment (by Peter Motzko).
- add simple backup of database to a PV (by Peter Motzko).
- updated swagger doc (by Ronak Thacker).
- updated swagger doc response sample and env file (by Ronak Thacker).
- add tests for env and secrets in values (by Peter Motzko).
- swagger doc request example updated (by Ronak Thacker).
- test case added for VC expiry check while VP validate as JWT (by Ronak Thacker).
- added end user documentation (by Ronak Thacker).
- added administrator documentation (by Ronak Thacker).
- adjust trivy GH Action (by Peter Motzko).
- remove manual trigger from veracode.yaml (by Peter Motzko).
- update KICS.yaml to fit current application (by Peter Motzko).
- update README.md by using current helm-docs template (by Peter Motzko).
- add Helm chart Readme template for helm-docs (by Peter Motzko).
- update chart description and add homepage link and keywords (by Peter Motzko).
- check expiry of VC while VP validate support added and test cases updated (by Ronak Thacker).
- updated context url of did document and test case (by Ronak Thacker).
- Extend Mac user information (by Peter Motzko).
- CGD-347: manage log level at runtime (by Nitin Vavdiya).
- Uncomment KC_HOSTNAME in env.docker.dist and env.local.dist (is required, not optional) (by Peter Motzko).
- Add DEV_ENVIRONMENT variable to env.docker.dist and env.local.dist (by Peter Motzko).
- CGD-368: Check expiry date of VC during validation (by Nitin Vavdiya).
- replace check for "docker compose" plugin (by Peter Motzko).
- remove docker compose selection -> fixed to new V2 version (by Peter Motzko).
- mark important content in README.md (by Peter Motzko).
- document COMPOSE_COMMAND env (by Peter Motzko).
- use COMPOSE_COMMAND env from env.* to execute the available docker compose binary (by Peter Motzko).
- add COMPOSE_COMMAND to env.*.dist to configure the available docker compose binary (by Peter Motzko).
- run Helm unittests (by Peter Motzko).
- suppress task header in output (by Peter Motzko).
- add missing tasks and rename working dir (by Peter Motzko).
- show install link provided as parameter (by Peter Motzko).
- add default labels to secret (by Peter Motzko).
- add tests for dev stage and put tests in subfolder for each stage (by Peter Motzko).
- put Helm chart unittests in subfolder for each stage (by Peter Motzko).
- update readme (by Peter Motzko).
- add tasks for test-report and coverage (by Peter Motzko).
- add task to check, if helm-docs is installed (by Peter Motzko).
- add task to rebuild Helm chart readme (by Peter Motzko).
- Update readme (by Peter Motzko).
- swagger doc updated as per new role in api and Retrieve wallet by identifier test cases updated (by Ronak Thacker).
- make Taskfile app namespace OS specific (by Peter Motzko).
- add environment type switch (by Peter Motzko).
- update .gitignore (by Peter Motzko).
- moved to dev-assets folder (by Peter Motzko).
- add realm for local dev config (by Peter Motzko).
- env-files move to dev folder (by Peter Motzko).
- script to obtain an authority token from keycloak (by Peter Motzko).
- rename tasks and point to new dev-env (by Peter Motzko).
- add new dev environment (by Peter Motzko).
- split tasks to own namespaces (by Peter Motzko).
- increment appVersion to 3.3.3.b420443 as an attempt (by Mathias Knoop).
- increment app version to '1.0.0-rc1' and chart version to '4.0.1-rc1' (by Mathias Knoop).
- json web signature and key generation from lib (by Nitin Vavdiya).
- fallthrough in check-prerequisites task (by Peter Motzko).
- authenticate using client_id and claint_secret added in swagger UI (by Nitin Vavdiya).
- add Helm unittests for default values (by Peter Motzko).
- remove "dash" from template (by Peter Motzko).
- add eclipse copyright header everywhere (by Peter Motzko).
- adds direct '.java-version' from program 'jenv' to '.gitignore' to avoid that is version-controled. (by Mathias Knoop).
- add more cleanup commands (by Peter Motzko).
- include checks and new "local.env" + add check-prerequisites task (by Peter Motzko).
- rename tasks in Taskfile (by Peter Motzko).
- add "local.dev" to .gitignore (by Peter Motzko).
- adds (initially) a Postman-collection for testing MIW on stage 'dev'. (by Mathias Knoop).
- add securityContext (primary same user/group id as docker image) (by Peter Motzko).
- use user/group id > 10000 and rename "user" to "miw" (by Peter Motzko).
- back to default values formatting (with accurate values) (by Peter Motzko).
- summary VC context URL updated (by Nitin Vavdiya).
- json web signature 2020 support added for did document, vc and vp (by Ronak Thacker).
- add and adjust authority user's BPN and DID:WEB (by Mathias Knoop).
- json web signature 2020 support WIP (by Ronak Thacker).
- set health check actuator resp. liveliness probe endpoint to '/actuator/health/liveness' and readiness probe endpoint to '/actuator/health/readiness' both on port '8090' (by Mathias Knoop).
- updated vc type (by Ronak Thacker).
- adjust task 'stopDockerApp' to stop the actual container 'local_miw_app' (by Mathias Knoop).
- Holder identifier added in framework VC subject (by Nitin Vavdiya).
- framework VC name changes and test case changes (by Nitin Vavdiya).
- adding generated 'README.md' to accompany the charts for 'Managed-Identity-Wallet' as required. (by Mathias Knoop).
- add app setup for the stages 'dev' and 'int' in order to deploy the (new) 'Managed-Identity-Wallet' on these stages. (by Mathias Knoop).
- validation added in issue VC api for summary VC (by Nitin Vavdiya).
- change in create VP API, type and name removed from summary VC (by Nitin Vavdiya).
- revert renaming and postpone that for later. (by Mathias Knoop).
- add '/dev.env' to '.gitignore' to prevent it form being comitted/ pushed unwanted. (by Mathias Knoop).
- rename tasks from beginning with 'run' to beginning with 'start' to achieve a uniform 'start...' and 'stop...' appearance of task names. (by Mathias Knoop).
- updated create wallet api (by Ronak Thacker).
- updated store credential api (by Ronak Thacker).
- summery VC flow after holder delete summary VC (by Nitin Vavdiya).
- Paggination support added in list VC API (by Nitin Vavdiya).
- summary credential test cases added (by Ronak Thacker).
- Summary VC flow, code changes as per input given in code review, test case changes as per summary VC flow (by Nitin Vavdiya).
- updated issuer credential api and test cases as per new api spec (by Ronak Thacker).
- Issuer get credential API testcases, test case modification for self_issued and is_stored (by Nitin Vavdiya).
- Testcase modification as per new API specification (by Nitin Vavdiya).
- delete credential api and test cases added (by Ronak Thacker).
- API changes as per new API specification(separate apis for holder and issuer wallet) (by Nitin Vavdiya).
- validate VP and validate VC test cases updated with mock (by Nitin Vavdiya).
- validate VP as jwt API, enforce https while did resolve in config, changes according to new lib (by Nitin Vavdiya).
- update lib method to resolved vc/vp validate (by Ronak Thacker).
- updated credential get api (by Ronak Thacker).
- token support added in swagger (by Nitin Vavdiya).
- test case of validate vc wip (by Ronak Thacker).
- credential get api type filter support added (by Ronak Thacker).
- shorten enc_key to 32 bytes (by Peter Motzko).
- extend application name (by Peter Motzko).
- add authority_wallet_did env (by Peter Motzko).
- WIP: add more stuff to Taskfile (by Peter Motzko).
- set ingress host type to "ImplementationSpecific" (by Peter Motzko).
- add classname annotation to ingress (by Peter Motzko).
- add init script to setup initial database (by Peter Motzko).
- read me file chamges, sample reponse added (by Nitin Vavdiya).
- set default values for dev environment in ArgoCD (by Peter Motzko).
- set default values for image tag and ingress className (by Peter Motzko).
- comment out default values (by Peter Motzko).
- comment out unused config (by Peter Motzko).
- add full release name to ingress secret name (by Peter Motzko).
- readm changes and gradle fix (by Nitin Vavdiya).
- update ditignore and dev.env added (by Nitin Vavdiya).
- readme added, validate VP wip (by Nitin Vavdiya).
- issue credential api test case added (by Ronak Thacker).
- add values for dev stage (WIP) (by Peter Motzko).
- remove unused secrets (by Peter Motzko).
- add container env (plain and from secret) (by Peter Motzko).
- add container env and DB secrets (by Peter Motzko).
- adjust to current setup (by Peter Motzko).
- rename miw service GH repo (by Peter Motzko).
- adjust Dockerfile to current setup (by Peter Motzko).
- change default name of miw-app artifact (by Peter Motzko).
- add local miw-app image to docker-compose (by Peter Motzko).
- credentials validation api wip (by Ronak Thacker).
- reamdme added with env verables, vp as jwt, credentials id added in table, search with credential id (by Nitin Vavdiya).
- caller BPN security added and test case modification for the same (by Nitin Vavdiya).
- remove acapy vars from .env.example (by Peter Motzko).
- change active Helm chart (by Peter Motzko).
- remove old acapy actions (by Peter Motzko).
- switch to new Helm chart "charts/managed-identity-wallet" (by Peter Motzko).
- add new helm chart "managed-identity-wallet" (WIP) (by Peter Motzko).
- added test cases for getCredentials api (by Ronak Thacker).
- code changes to create DidDocument (by Nitin Vavdiya).
- authority wallet did in env (by Nitin Vavdiya).
- presenation API WIP, code refactor (by Nitin Vavdiya).
- Create BPN VC while creating wallet, test case modification, filter support added in get all wallet and get all credential API (by Nitin Vavdiya).
- bpnCredential added in wallet creation (by Ronak Thacker).
- Framwork VC API, Dismantler VC API, Testcase modificatoin, VC context URL in config, VC expiry in config (by Nitin Vavdiya).
- test cases added for issueMembershipCredential api (by Ronak Thacker).
- membership credentials api added (by Ronak Thacker).
- ssi lib v4 added, autority wallet config added (by Nitin Vavdiya).
- Store credential API with test case, Validate test case (by Nitin Vavdiya).
- credential list api added (by Ronak Thacker).
- Store credntial API, testcase mofitication based on DidDocument Java POJO (by Nitin Vavdiya).
- ssi:lib version updated (by Ronak Thacker).
- Spring security added with keycloak, Swagger added, Testcases modification based on spring security (by Nitin Vavdiya).
- Resolve the DID document for a given DID or BPN api added (by Ronak Thacker).
- disable authorization check, because of potential bug (to be investigated) (by Peter Motzko).
- add console logger to db init transaction (commented out, but useful for debugging) (by Peter Motzko).
- adjust naming to snake_case and add suffixes (by Peter Motzko).
- Bump Keycloak version of docker-compose to 21.1 and update env file (by Peter Motzko).
- Add first helm unittest draft for Deployment resource (by Peter Motzko).
- Introduce Taskfile (by Peter Motzko).
- Replace old custom Dockerfile with official postgres image (by Peter Motzko).
- Remove obsolete stuff (by Peter Motzko).

### Bug Fixes

- update README.md and remove duplicate variable (by Peter Motzko).
- adjust test (by Peter Motzko).
- use user/group 11111 instead of 1001/0 (by Peter Motzko).
- typo (by Peter Motzko).
- skip app tests (by Peter Motzko).
- add GITHUB_TOKEN variable before app build (by Peter Motzko).
- install java 17 (by Peter Motzko).
- build miw app (by Peter Motzko).
- install Taskfile (by Peter Motzko).
- quote python version (by Peter Motzko).
- add missing "quote" function and adjust tests (by Peter Motzko).
- fix suggested issues from PR (by Peter Motzko).
- update image repo (by Peter Motzko).
- remove trailing space (by Peter Motzko).
- add space (typo) (by Peter Motzko).
- remove duplicate env var (by Peter Motzko).
- removed recret from code (by Ronak Thacker).
- add empty object (by Peter Motzko).
- validation erorr message not shown in reponse, docs: CGD-391: sample repomse added in wallet APIs (by Nitin Vavdiya).
- Veracode finding for CVE-2023-24998 (by Nitin Vavdiya).
- test cases (by Nitin Vavdiya).
- veracode log issue (by Nitin Vavdiya).
- veracode log realted issue fix (by Nitin Vavdiya).
- veracode issues: Spring boot and other lib version update (by Nitin Vavdiya).
- fix test values for helm test in GH Actions (by Peter Motzko).
- adjust gradle build command and remove unused code (by Peter Motzko).
- missing add repo step from chart-releaser workflow (by Gábor Almádi).
- conflict resolved (by Nitin Vavdiya).
- replace docker_compose env var with real command (by Peter Motzko).
- split into two lines (by Peter Motzko).
- add missing "sudo" (by Peter Motzko).
- move information about docker for macos upwards (by Peter Motzko).
- add empty line at the bottom for Helm lint testing (by Peter Motzko).
- use jdk 17 instead of jdk 18 and remove the EXPOSE statement (by Peter Motzko).
- add install links to check-tools.yaml (by Peter Motzko).
- move APPLICATION_PORT env var outside if condition (by Peter Motzko).
- CGD-288 and code refactor (by Nitin Vavdiya).
- use "localhost" instead docker container name (by Peter Motzko).
- attempt to deploy recent code (by Mathias Knoop).
- adjust git history for Peter Motzko, peter.motzko@volkswagen.de (by Mathias Knoop).
- remove quotes (by Peter Motzko).
- quote numbers (by Peter Motzko).
- adjust resources and limits for 'managed-identity-wallets-new' in order to attain and retain app-health-status. (by Mathias Knoop).
- adjust values to enable sync again. (by Mathias Knoop).
- adjust values for timeouts and resources for 'liveness' and 'readiness' actuators to mitigate restarts to to cpu-throttling and respective memory peaks which would possibly yield a restart, too. (by Mathias Knoop).
- CGD-238: BPN from access_token ignore case (by Nitin Vavdiya).
- changes task name to 'build' from 'buildJar' and adjusts all occurrences in file 'Taskfile'. (by Mathias Knoop).
- remove token (already revoked) (by Peter Motzko).
- remove double className (by Peter Motzko).
- remove last slash (by Peter Motzko).
- set ingress host path  to "/" (by Peter Motzko).
- bind APPLICATION_PORT to 8080 (by Peter Motzko).
- add random generated encryption_key (by Peter Motzko).
- typo in db_host (by Peter Motzko).
- wrong data type in secret (by Peter Motzko).
- add correct service for postgresql db (by Peter Motzko).
- use lowercase letters for repository name (by Peter Motzko).
- default port for postgresDB (by Peter Motzko).

### Code Refactoring

- adjust values according to latest changes (by Peter Motzko).
- reorder postgres config and envs in deployment (by Peter Motzko).
- CGD-401 and CGD-399: logs added, xss protection added, removed secret from config file (by Nitin Vavdiya).
- rename tests suites (by Peter Motzko).
- move test template definition out to root (by Peter Motzko).
- remove manual trigger (by Peter Motzko).
- remove old MIW Helm chart (by Peter Motzko).
- use custom values.yaml (instead of values-dev.yaml) for testing and add more tests (by Peter Motzko).
- remove env.environment due to set env order of Taskfile (by Peter Motzko).
- reorder variables (by Peter Motzko).
- add missing task to linux tasks (by Peter Motzko).
- spilt tasks after os in folders (by Peter Motzko).
- move get_token.sh to scripts folder (by Peter Motzko).
- rename paths (by Peter Motzko).
- auth method removed, company name removed from sample data (by Nitin Vavdiya).
- allowedVehicleBrands optional while issue Dismantler VC (by Nitin Vavdiya).
- refactor Taskfile (by Peter Motzko).
- variable name change and minor refactor (by Nitin Vavdiya).
