# TLDR

**Download** an APK from Google Play

```apkeep -a [com.example.app] .```

Download **specific version**

```apkeep -a [com.example.app]@[version] .```

Download using **credentials file**

```apkeep -a [com.example.app] -c [credentials.txt] .```

List available **versions**

```apkeep -a [com.example.app] -l```

# SYNOPSIS

**apkeep** [_-a package_] [_-c credentials_] [_-l_] _output_dir_

# DESCRIPTION

**apkeep** downloads APK files from Google Play Store and other Android app sources. It can fetch current or specific historical versions of applications, useful for security research, app archival, or accessing region-restricted apps.

The tool authenticates with Google Play to download APKs, requiring valid credentials or tokens.

# PARAMETERS

**-a** _package_
> Application package name (optionally with @version)

**-c** _file_
> Credentials file

**-l**
> List available versions

**-d** _device_
> Device configuration to spoof

**-s** _source_
> Source: googleplay, apkmirror, fdroid

**-o** _format_
> Output format

# CAVEATS

Requires valid Google Play credentials for most downloads. Google may rate-limit or block excessive downloads. Downloaded APKs are licensed to the account used.

# HISTORY

**apkeep** was developed for legitimate APK archival and security research purposes, providing command-line access to Android app stores.

# SEE ALSO

[adb](/man/adb)(1), [apktool](/man/apktool)(1)
