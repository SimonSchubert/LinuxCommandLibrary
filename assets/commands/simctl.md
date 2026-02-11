# TAGLINE

Manage Apple iOS simulators

# TLDR

**List all simulators** and runtimes

```xcrun simctl list```

**Boot a simulator** by name or UUID

```xcrun simctl boot "[iPhone 15 Pro]"```

**Shutdown a simulator**

```xcrun simctl shutdown [device_uuid|booted]```

**Install an app** on a booted simulator

```xcrun simctl install booted [path/to/app.app]```

**Launch an app** on the simulator

```xcrun simctl launch booted [com.example.bundleid]```

**Take a screenshot** of the simulator

```xcrun simctl io booted screenshot [output.png]```

**Send a push notification**

```xcrun simctl push booted [com.example.bundleid] [notification.apns]```

**Grant a privacy permission** to an app

```xcrun simctl privacy booted grant [location] [com.example.bundleid]```

# SYNOPSIS

**xcrun simctl** _subcommand_ [_arguments_]

# SUBCOMMANDS

**list** [_devices_|_devicetypes_|_runtimes_|_pairs_]
> List available devices, device types, runtimes, or device pairs.

**create** _name_ _devicetype_ _runtime_
> Create a new simulator with the specified name, device type, and runtime.

**delete** _device_
> Delete a simulator device.

**boot** _device_
> Boot a simulator device.

**shutdown** _device_|**all**
> Shutdown a simulator or all simulators.

**erase** _device_|**all**
> Erase a simulator's contents and settings.

**install** _device_ _app_path_
> Install an application bundle on a simulator.

**uninstall** _device_ _bundle_id_
> Uninstall an application by bundle identifier.

**launch** _device_ _bundle_id_ [_args_]
> Launch an application on a simulator.

**terminate** _device_ _bundle_id_
> Terminate a running application.

**io** _device_ _operation_
> Perform I/O operations: screenshot, recordVideo.

**push** _device_ _bundle_id_ _json_file_
> Send a push notification to a running application.

**privacy** _device_ _action_ _service_ _bundle_id_
> Manage privacy permissions (grant, revoke, reset).

**addmedia** _device_ _paths_
> Add photos or videos to the simulator's photo library.

**openurl** _device_ _url_
> Open a URL in the simulator.

**runtime** **add**|**delete** _path_
> Manage simulator runtime disk images.

**help** [_subcommand_]
> Display help for simctl or a specific subcommand.

# DESCRIPTION

**simctl** is Apple's command-line tool for managing and interacting with iOS, watchOS, and tvOS simulators on macOS. It's accessed through **xcrun simctl** to ensure the correct version matching your active Xcode installation is used.

The tool provides comprehensive control over simulator lifecycle (create, boot, shutdown, delete), application management (install, launch, uninstall), and testing features (push notifications, privacy permissions, screenshots, video recording). It's particularly useful for automated testing, CI/CD pipelines, and development workflows.

The special identifier **booted** can be used to target the currently running simulator instead of specifying a UUID.

# CAVEATS

Only available on macOS with Xcode installed. Requires the Xcode Command Line Tools. Some features like privacy management require Xcode 11.4 or later. Simulator runtimes consume significant disk space. The tool path is **/Applications/Xcode.app/Contents/Developer/usr/bin/simctl** but should be invoked via **xcrun** to ensure version compatibility.

# HISTORY

**simctl** was introduced by Apple as part of Xcode to replace older simulator management tools. It has evolved alongside iOS development, gaining features for push notification testing, privacy permission management, and improved runtime handling. The tool has become essential for iOS CI/CD workflows and automated testing, comparable to Android's **adb** command.

# SEE ALSO

[xcrun](/man/xcrun)(1), [xcodebuild](/man/xcodebuild)(1), [instruments](/man/instruments)(1)
