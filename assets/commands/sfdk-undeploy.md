# TAGLINE

Remove deployed apps from Sailfish devices

# TLDR

**Remove the project's packages using the SDK method**

```sfdk undeploy --sdk```

**Preview what would be removed**

```sfdk undeploy --sdk --dry-run```

**Remove everything deployed from this build host**

```sfdk undeploy --sdk --all```

**Remove files deployed with rsync**

```sfdk undeploy --rsync```

# SYNOPSIS

**sfdk undeploy** {**--pkcon**|**--rpm**|**--rsync**|**--sdk**|**--zypper**} [**--all**] [**-n**|**--dry-run**] [**--**] [[**+**|**-**]_pattern_...]

# PARAMETERS

**--pkcon**
> Remove RPM packages using **pkcon**. Not permitted by all device OS versions and configurations.

**--rpm**
> Remove RPM packages using plain **rpm**. Requires root access to the device.

**--rsync**
> Remove files copied under **/opt/sdk/**_name_ with **sfdk deploy --rsync**.

**--sdk**
> Use the method native to the SDK. Requires developer mode on the device.

**--zypper**
> Remove RPM packages using **zypper**. Requires **zypper** on the device and root access.

**--all**
> Consider all build results originating from this build host.

**-n**, **--dry-run**
> Preview the list of (sub)packages that would be removed.

# DESCRIPTION

**sfdk undeploy** removes build results previously deployed to the configured device. One method option is mandatory. Packages are matched by the build host name recorded in their metadata, and by default only those of the project in the current directory are considered. Part of the Sailfish SDK command-line tool.

The selection can be adjusted with glob patterns, each optionally prefixed with **+** to include or **-** to exclude. Options must precede patterns.

# CAVEATS

The host name must be stable and unique among those recorded by packages from other sources. Except for **--rsync**, the method need not match the one used with **sfdk deploy**. The **--rsync** method does not verify the origin of the files it removes.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-deploy](/man/sfdk-deploy)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
