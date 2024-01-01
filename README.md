# Chemistry lab mod
<a href="https://quiltmc.org/"><img src="./.github/assets/badges/made-for-quilt.svg" height="21px"></a> <a href="https://forums.minecraftforge.net"><img src="./.github/assets/badges/forge-coming-soon.svg" height="21px"></a> <a href="https://modrinth.com/mod/modmenu"><img src="./.github/assets/badges/compatible-with-modmenu.svg" height="21px"></a>

> [!NOTE]
> This mod is currently only available for quilt. I will eventually make a forge port, however fabric is not possible due to the licensing of a library I am using. Porting to fabric would mean that flames and such would look quite different. *(99% of fabric mods work on quilt)*

If you like this mod, please join my discord server by clicking the button below:
<br><br>
[![](https://dcbadge.vercel.app/api/server/qQYfX3sTyj?style=flat)](https://discord.gg/qQYfX3sTyj)

<details>
  <summary><h2>For developers</h2></summary>
  If you would like to use items, blocks and other things in your own mod, you can add Chemistry lab as a gradle dependency using one of the following methods:

 ### Using Jitpack:
In your `build.gradle` file, make sure you have included the jitpack maven repository, similar as to the following:
```groovy
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.cph101:Chemistry-lab-mod:v1.0.1-1.19.2'
}
```
The dependency version may be inferred from the tag name of the github release you wish to use (See [latest](https://github.com/cph101/Chemistry-lab-mod/releases/latest))
</details>
