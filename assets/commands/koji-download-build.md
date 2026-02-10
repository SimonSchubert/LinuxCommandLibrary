# TAGLINE

downloads built packages from the Koji build system

# TLDR

Download **all RPMs** from a build

```koji download-build [build_id|nvr]```

Download RPMs for **specific architecture**

```koji download-build [build_id] --arch x86_64```

Download RPMs signed with **specific key**

```koji download-build [build_id] --key [key_id]```

Download a **specific RPM**

```koji download-build [rpm_name] --rpm```

Download **source RPM**

```koji download-build [build_id] --type src```

Display **help**

```koji download-build --help```

# SYNOPSIS

**koji download-build** [_options_] _build_id_|_nvr_|_rpm_

# DESCRIPTION

**koji download-build** downloads built packages from the Koji build system. You can specify a build by its ID, NVR (Name-Version-Release), or download a specific RPM directly.

# PARAMETERS

**build_id|nvr|rpm**
> Build identifier, NVR string, or RPM name

**--arch ARCH**
> Only download RPMs for specified architecture (e.g., x86_64, aarch64, noarch)

**--key KEY**
> Only download RPMs signed with the specified key

**--rpm**
> Interpret the argument as an RPM name

**--type TYPE**
> Download specific type: rpm, src, debuginfo

**--latestfrom TAG**
> Download latest build from specified tag

**--topdir DIR**
> Specify download directory

**-h, --help**
> Display help information

# CAVEATS

Large builds with many subpackages may take significant time and bandwidth. Signed RPMs require the signing key to be available in Koji.

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1), [dnf](/man/dnf)(8)
