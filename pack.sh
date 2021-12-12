jpackage --input target/ \
  --name JPackageDemoApp \
  --main-jar java-14-17-demo-1.0-SNAPSHOT.jar \
  --main-class com.epam.demo.jpackage.GuiApp \
  --type dmg \
  --java-options '--enable-preview'