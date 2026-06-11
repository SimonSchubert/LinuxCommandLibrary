# TAGLINE

Download APKs from app stores

# TLDR

**Download** an APK from the default source (APKPure)

```apkeep -a [com.example.app] .```

Download a **specific version**

```apkeep -a [com.example.app]@[version] .```

Download from **Google Play** using an account email and AAS token

```apkeep -a [com.example.app] -d google-play -e [user@gmail.com] -t [aas_token] .```

Download from **F-Droid**

```apkeep -a [com.example.app] -d f-droid .```

List available **versions**

```apkeep -a [com.example.app] -l```

Download many apps listed in a **CSV file**

```apkeep -c [apps.csv] .```

# SYNOPSIS

**apkeep** <**-a** _app_id[@version]_ | **-c** _csv_> [_options_] _OUTPATH_

# DESCRIPTION

**apkeep** downloads APK files from several Android app sources. It can fetch current or specific historical versions of applications, useful for security research, app archival, or accessing apps without a device.

By default it downloads from APKPure, which requires no credentials. Downloading from Google Play requires an account email and an AAS token. Apps can be specified individually with **-a** or in bulk from a CSV file with **-c**.

# PARAMETERS

**-a, --app** _app_id[@version]_
> App ID, optionally with @version (e.g. com.instagram.android).

**-c, --csv** _file_
> CSV file listing app IDs to download in bulk.

**-f, --field** _n_
> CSV field (column) containing app IDs. Default is **1**.

**-v, --version-field** _n_
> CSV field containing versions.

**-d, --download-source** _source_
> Where to download from: **apk-pure** (default), **google-play**, **f-droid**, **huawei-app-gallery**.

**-l, --list-versions**
> List the available versions of an app instead of downloading.

**-e, --email** _email_
> Google account email address (required for google-play).

**-t, --aas-token** _token_
> Google AAS token (required for google-play).

**-o, --options** _opts_
> Comma-separated extra options for the download source (e.g. arch=arm64-v8a).

**-r, --parallel** _n_
> Number of parallel APK fetches to run at a time. Default is **4**.

**-s, --sleep-duration** _ms_
> Sleep duration in milliseconds before each download request. Default is **0**.

# CAVEATS

Google Play downloads require a valid account email and AAS token; see the project documentation for how to obtain one. Servers may rate-limit or block excessive downloads, so use **-s** to throttle. Downloaded APKs remain subject to their original license.

# HISTORY

**apkeep** was developed by the EFF Threat Lab and first released in **2021**, written in Rust, providing command-line access to multiple Android app sources for archival and security research.

# SEE ALSO

[adb](/man/adb)(1), [apktool](/man/apktool)(1), [aapt](/man/aapt)(1)

# RESOURCES

```[Source code](https://github.com/EFForg/apkeep)```

```[Homepage](https://www.eff.org/pages/apkeep)```

<!-- verified: 2026-06-11 -->
