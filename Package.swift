// swift-tools-version:5.3
import PackageDescription

let package = Package(
   name: "Shared",
   platforms: [
     .iOS(.v14),
   ],
   products: [
      .library(name: "Shared", targets: ["Shared"])
   ],
   targets: [
      .binaryTarget(
         name: "Shared",
         url: "https://github.com/morale3232/multiplatform-demo/releases/download/1.0.0-alpha/Shared.xcframework.zip",
         checksum:"8fabe69069a580499580f0639a17a9302abff8dd4606ead351af9da5af058a12")
   ]
)
