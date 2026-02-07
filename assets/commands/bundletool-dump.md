# TAGLINE

Inspect Android App Bundle contents

# TLDR

**Dump the AndroidManifest.xml** from an app bundle

```bundletool dump manifest --bundle=[app.aab]```

**Get a specific manifest value** using XPath

```bundletool dump manifest --bundle=[app.aab] --xpath=/manifest/@versionCode```

**Dump all resources** from an app bundle

```bundletool dump resources --bundle=[app.aab]```

**Dump a specific resource** by ID

```bundletool dump resources --bundle=[app.aab] --resource=[0x7f0e013a] --values```

**Dump bundle configuration**

```bundletool dump config --bundle=[app.aab]```

**Dump signature information**

```bundletool dump signatures --bundle=[app.aab]```

# SYNOPSIS

**bundletool** **dump** _subcommand_ **--bundle**=_path_ [_options_]

# SUBCOMMANDS

**manifest**
> Dump the parsed AndroidManifest.xml content.

**resources**
> Dump detailed information about the app's resources.

**config**
> Dump bundle configuration (SDK versions, ABIs, screen densities).

**signatures**
> Dump digital signature information.

# PARAMETERS

**--bundle** _path_
> Path to the Android App Bundle (.aab) file.

**--xpath** _expression_
> XPath expression to extract specific manifest values.

**--resource** _id_
> Specific resource ID to dump.

**--values**
> Include resource values in output.

# DESCRIPTION

**bundletool dump** analyzes the internal structure and metadata of Android App Bundles (.aab) and APK files. It's part of Google's bundletool, the underlying tool used by Android Studio and Google Play to build and process App Bundles.

Use cases include build verification, security analysis of signing certificates, resource management inspection, and debugging manifest issues.

# CAVEATS

Requires Java Runtime Environment (JRE) version 11 or higher. Not typically pre-installed on Linux systems.

# SEE ALSO

[bundletool](/man/bundletool)(1), [bundletool-validate](/man/bundletool-validate)(1), [apktool](/man/apktool)(1)
