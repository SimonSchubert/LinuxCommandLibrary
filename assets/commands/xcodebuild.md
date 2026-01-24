# TLDR

**Build a project** with default settings

```xcodebuild```

**Build a specific scheme**

```xcodebuild -scheme [SchemeName]```

**Build for a specific SDK** and destination

```xcodebuild -scheme [SchemeName] -sdk iphoneos -destination "generic/platform=iOS"```

**Build a workspace**

```xcodebuild -workspace [App.xcworkspace] -scheme [SchemeName]```

**Create an archive**

```xcodebuild archive -scheme [SchemeName] -archivePath [path/to/App.xcarchive]```

**Export an archive** to IPA

```xcodebuild -exportArchive -archivePath [App.xcarchive] -exportPath [output] -exportOptionsPlist [options.plist]```

**Run tests**

```xcodebuild test -scheme [SchemeName] -destination "platform=iOS Simulator,name=iPhone 15"```

**List available schemes**

```xcodebuild -list```

**List available SDKs**

```xcodebuild -showsdks```

# SYNOPSIS

**xcodebuild** [**-project** _name_] [**-workspace** _name_] [**-scheme** _name_] [**-target** _name_] [**-sdk** _sdk_] [**-destination** _dest_] [_action_...]

# PARAMETERS

**-project** _name_
> Build the project specified by name.xcodeproj.

**-workspace** _name_
> Build the workspace specified by name.xcworkspace.

**-scheme** _name_
> Build the scheme with the specified name. Required for workspaces.

**-target** _name_
> Build the target with the specified name.

**-sdk** _sdk_
> Build with the specified SDK (iphoneos, iphonesimulator, macosx).

**-destination** _destination_
> Use the destination described by destination.

**-configuration** _config_
> Build configuration: Debug or Release.

**-archivePath** _path_
> Path for archive output.

**-exportPath** _path_
> Path for export output.

**-exportOptionsPlist** _path_
> Plist file specifying export options.

**-list**
> List all targets, schemes, and configurations.

**-showsdks**
> List all available SDKs.

**-allowProvisioningUpdates**
> Allow automatic provisioning profile management.

**build**
> Build the target (default action).

**archive**
> Create an archive for distribution.

**test**
> Run unit tests.

**clean**
> Remove build products.

# DESCRIPTION

**xcodebuild** is Apple's command-line tool for building Xcode projects and workspaces. It performs build, test, archive, and export operations, making it essential for CI/CD pipelines and automated builds of macOS, iOS, watchOS, and tvOS applications.

The tool works with projects (.xcodeproj) or workspaces (.xcworkspace). Workspaces, commonly used with CocoaPods or Swift Package Manager, require specifying a scheme. Schemes define which targets to build and with what configuration.

Building for iOS distribution is typically a two-step process: first **archive** to create an .xcarchive, then **-exportArchive** with an export options plist to produce the final .ipa file. Code signing and provisioning can be managed automatically with **-allowProvisioningUpdates**.

# CAVEATS

Requires Xcode installation (not just Command Line Tools). Use `xcode-select -s` to switch developer directories if needed. Archive and export require valid code signing identities and provisioning profiles. Simulator destinations require the simulator to be installed.

# HISTORY

**xcodebuild** has been part of **Xcode** since its early versions, evolving alongside Apple's development tools. The tool has grown significantly more powerful, adding workspace support, destination specifiers for simulators and devices, and xcpretty-compatible output. It remains the foundation for iOS and macOS continuous integration systems.

# SEE ALSO

[xcrun](/man/xcrun)(1), [xcode-select](/man/xcode-select)(1), [codesign](/man/codesign)(1), [swift](/man/swift)(1)
