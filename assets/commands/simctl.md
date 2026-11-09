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

**List only available** devices as JSON

```xcrun simctl list --json devices available```

**Create** a new simulator

```xcrun simctl create "[My iPhone]" "[iPhone 15 Pro]"```

**Record a video** until Ctrl+C is pressed

```xcrun simctl io booted recordVideo [output.mov]```

**Open a URL** or deep link

```xcrun simctl openurl booted [https://example.com]```

**Set the simulated** location

```xcrun simctl location booted set [52.52,13.40]```

**Override the status bar** for clean screenshots

```xcrun simctl status_bar booted override --time "[9:41]" --batteryLevel [100]```

**Print the data container** path of an app

```xcrun simctl get_app_container booted [com.example.bundleid] data```

**Delete** simulators unavailable with the current Xcode

```xcrun simctl delete unavailable```

# SYNOPSIS

**xcrun simctl** _subcommand_ [_arguments_]

# SUBCOMMANDS

**list** [**-j**] [_devices_|_devicetypes_|_runtimes_|_pairs_] [_search_|**available**]
> List available devices, device types, runtimes, or device pairs, optionally as JSON.

**create** _name_ _devicetype_ [_runtime_]
> Create a new simulator. Without a runtime, the newest compatible one is chosen.

**clone** _device_ _name_
> Clone an existing device.

**rename** _device_ _name_
> Rename a device.

**delete** _device_...|**unavailable**|**all**
> Delete simulators, those unsupported by the current Xcode, or all of them.

**boot** _device_
> Boot a simulator device.

**shutdown** _device_|**all**
> Shutdown a simulator or all simulators.

**erase** _device_...|**all**
> Erase a simulator's contents and settings.

**upgrade** _device_ _runtime_
> Upgrade a device to a newer runtime.

**install** _device_ _app_path_
> Install an application bundle on a simulator.

**uninstall** _device_ _bundle_id_
> Uninstall an application by bundle identifier.

**launch** [**--console**] _device_ _bundle_id_ [_args_]
> Launch an application on a simulator. **--console** blocks and prints its output.

**listapps** _device_
> Show the installed applications.

**appinfo** _device_ _bundle_id_
> Show information about an installed application.

**get_app_container** _device_ _bundle_id_ [_container_]
> Print the path of an app's container: app, data, groups or a group identifier.

**spawn** _device_ _executable_ [_args_]
> Run an executable inside the simulator.

**terminate** _device_ _bundle_id_
> Terminate a running application.

**io** _device_ _operation_
> Perform I/O operations: screenshot, recordVideo, enumerate, poll.

**push** _device_ [_bundle_id_] _json_file_|**-**
> Send a simulated push notification. The bundle ID may instead come from the payload.

**privacy** _device_ _action_ _service_ _bundle_id_
> Manage privacy permissions (grant, revoke, reset).

**addmedia** _device_ _paths_
> Add photos, live photos, videos, or contacts to the device library.

**openurl** _device_ _url_
> Open a URL in the simulator.

**location** _device_ **set** _lat,lon_|**clear**|**list**|**run**|**start**
> Control the simulated location.

**status_bar** _device_ **override**|**clear**|**list**
> Set or clear status bar overrides.

**pbcopy**, **pbpaste** _device_
> Write to or read from the device pasteboard.

**keychain** _device_ **add-root-cert**|**add-cert**|**reset**
> Manipulate the device keychain.

**ui** _device_ _option_
> Get or set UI options such as appearance.

**diagnose**
> Collect diagnostic information and logs.

**pair**, **unpair**, **pair_activate**
> Manage watch and phone pairs.

**runtime** **add**|**delete**|**list**|**verify**|**unmount**
> Manage simulator runtime disk images.

**help** [_subcommand_]
> Display help for simctl or a specific subcommand.

# DESCRIPTION

**simctl** is Apple's command-line tool for managing and interacting with iOS, watchOS, and tvOS simulators on macOS. It's accessed through **xcrun simctl** to ensure the correct version matching your active Xcode installation is used.

The tool provides comprehensive control over simulator lifecycle (create, boot, shutdown, delete), application management (install, launch, uninstall), and testing features (push notifications, privacy permissions, screenshots, video recording). It's particularly useful for automated testing, CI/CD pipelines, and development workflows.

The special identifier **booted** can be used to target a running simulator instead of specifying a UUID. If several are booted, simctl picks one of them. Environment variables prefixed with **SIMCTL_CHILD_** are passed to launched processes.

# CAVEATS

Only available on macOS with full Xcode installed; the standalone Command Line Tools do not include it. Some features like privacy management require Xcode 11.4 or later. Simulator runtimes consume significant disk space. The tool path is **/Applications/Xcode.app/Contents/Developer/usr/bin/simctl** but should be invoked via **xcrun** to ensure version compatibility.

# HISTORY

**simctl** was introduced by Apple as part of Xcode to replace older simulator management tools. It has evolved alongside iOS development, gaining features for push notification testing, privacy permission management, and improved runtime handling. The tool has become essential for iOS CI/CD workflows and automated testing, comparable to Android's **adb** command.

# SEE ALSO

[xcrun](/man/xcrun)(1), [xcodebuild](/man/xcodebuild)(1)

# RESOURCES

```[Homepage](https://developer.apple.com/xcode/)```

<!-- verified: 2026-11-09 -->
