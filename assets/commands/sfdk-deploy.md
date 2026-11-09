# TAGLINE

Deploy Sailfish apps to devices or emulators

# TLDR

**Select the target device**

```sfdk config device="[device_name]"```

**Deploy with the SDK method** (developer mode required)

```sfdk deploy --sdk```

**Only transfer RPMs** to ~/RPMS on the device

```sfdk deploy --manual```

**Deploy with zypper dup**

```sfdk deploy --zypper-dup```

**Preview deployment** without applying

```sfdk deploy --zypper-dup --dry-run```

**Deploy all packages** from a shared output directory

```sfdk deploy --sdk --all```

**Exclude subpackages** by pattern

```sfdk deploy --sdk -- [-*-tests]```

# SYNOPSIS

**sfdk deploy** {**--pkcon**|**--rsync**|**--sdk**|**--zypper**|**--zypper-dup**|**--manual**} [**--all**] [**--debug**] [**-n**|**--dry-run**] [**--**] [[**+**|**-**]_pattern_...]

# PARAMETERS

**--sdk**
> Use the method native to the SDK to install RPM packages. Requires developer mode on the device.

**--pkcon**
> Use pkcon to install RPM packages. Not permitted on all device OS versions and configurations.

**--zypper**
> Use zypper in to install RPM packages. Requires zypper and root access on the device.

**--zypper-dup**
> Use zypper dup, which can select the right subpackages automatically in many cases. Convenient for updating platform packages. Requires zypper and root access on the device.

**--rsync**
> Transfer the RPM buildroot to /opt/sdk/_name_ without building or installing true RPM packages. Populate it with the make-install command. Incompatible with **--all**.

**--manual**
> Only transfer the RPM packages to ~/RPMS on the device for manual installation.

**--all**
> Deploy all packages found in a shared output directory, regardless of origin.

**--debug**
> Include debuginfo and debugsource subpackages, which are otherwise excluded.

**-n**, **--dry-run**
> Preview the packages to deploy without applying changes. Packages may still be transferred, depending on the method.

_pattern_
> Glob selecting subpackages, preceded by **+** to include (default) or **-** to exclude. Patterns are cumulative and evaluated left to right.

# DESCRIPTION

**sfdk deploy** deploys the build results of the project in the current directory to the device selected with the **device** configuration option. Exactly one deployment method must be given. Registered devices can be listed with **sfdk device list**.

# CAVEATS

Options must precede patterns. Sideloaded packages may conflict with repository packages, so future upgrades may not succeed cleanly if a package has incorrect version information.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-prepare](/man/sfdk-prepare)(1), [sfdk-undeploy](/man/sfdk-undeploy)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Homepage](https://sailfishos.org/)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/Deploying_packages/)```

<!-- verified: 2026-11-09 -->
