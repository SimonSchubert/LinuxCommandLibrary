# TAGLINE

Locate and run macOS developer tools

# TLDR

**Find the path** to a developer tool

```xcrun --find [clang]```

**Run a tool** from the active developer directory

```xcrun [clang] [arguments]```

**Print the path of an SDK**

```xcrun --sdk [iphoneos] --show-sdk-path```

**List available SDKs**

```xcodebuild -showsdks```

**Run with a specific SDK**

```xcrun --sdk [macosx] [tool] [arguments]```

**Print the platform path** of the selected SDK

```xcrun --show-sdk-platform-path```

**Switch toolchain** and run a command

```xcrun --toolchain [XcodeDefault] [swift] --version```

**Boot a simulator** device

```xcrun simctl boot "[iPhone 15]"```

**Notarize an app** for distribution

```xcrun notarytool submit [app.zip] --apple-id [email] --team-id [TEAM_ID] --password [password]```

# SYNOPSIS

**xcrun** [_--sdk sdkname_] [_--toolchain name_] [_--find tool_] [_--run tool_] [_--show-sdk-path_] [_--log_] [_--verbose_] [_--kill-cache_] [_tool arguments ..._]

# PARAMETERS

**--sdk** _sdkname_
> Use the specified SDK (e.g., macosx, iphoneos, iphonesimulator).

**--toolchain** _name_
> Use the specified toolchain.

**-f**, **--find** _tool_
> Print the full path to the specified tool.

**-r**, **--run** _tool_
> Run the specified tool (default behavior when tool name given).

**--show-sdk-path**
> Print the path to the selected SDK.

**--show-sdk-version**
> Print the version of the selected SDK.

**--show-sdk-build-version**
> Print the build version of the selected SDK.

**--show-toolchain-path**
> Print the path to the preferred toolchain for the selected SDK.

**--show-sdk-platform-path**
> Print the platform path for the selected SDK.

**--show-sdk-platform-version**
> Print the platform version for the selected SDK.

**-l**, **--log**
> Print the full command line that is invoked.

**-v**, **--verbose**
> Add verbose information on how the tool lookup is performed.

**-n**, **--no-cache**
> Do not consult the cache; refreshes the cache entry.

**-k**, **--kill-cache**
> Remove the cache so all values are re-cached.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**xcrun** is macOS's command-line utility for locating and invoking developer tools from the Xcode toolchain. It serves as an intelligent wrapper that finds the correct version of tools like **clang**, **swift**, **ld**, and others based on the active Xcode installation and selected SDK.

The tool resolves the complexity of having multiple Xcode versions or SDKs installed by automatically selecting the appropriate tool version. It respects the **DEVELOPER_DIR**, **SDKROOT** and **TOOLCHAINS** environment variables and the setting from **xcode-select**, making it essential for build scripts and CI/CD pipelines that need consistent tool resolution.

Beyond simple tool invocation, xcrun provides access to powerful subcommands through tools like **simctl** for iOS Simulator management, **notarytool** for app notarization, **altool** for App Store uploads, and **stapler** for attaching notarization tickets.

# CAVEATS

Only available on macOS with Xcode or Command Line Tools installed. Tool resolution fails if no valid developer directory is configured (use **xcode-select --install** to fix). Cached paths may become stale after Xcode updates; use **--kill-cache** to refresh. Some tools require a full Xcode installation rather than just Command Line Tools.

# HISTORY

**xcrun** ships with Xcode and the Command Line Tools. Its lookup through the active developer directory allows multiple Xcode versions to coexist and enables tools to be versioned with their parent Xcode release.

# SEE ALSO

[xcode-select](/man/xcode-select)(1), [xcodebuild](/man/xcodebuild)(1), [clang](/man/clang)(1), [swift](/man/swift)(1), [simctl](/man/simctl)(1)

# RESOURCES

```[Homepage](https://developer.apple.com/xcode/)```

```[Documentation](https://developer.apple.com/library/archive/technotes/tn2339/_index.html)```

<!-- verified: 2026-11-09 -->
