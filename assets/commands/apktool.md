# TAGLINE

Reverse engineer Android APK files

# TLDR

**Decode** (decompile) an APK

```apktool d [app.apk]```

Decode to **specific directory**

```apktool d [app.apk] -o [output_dir]```

**Build** (recompile) an APK

```apktool b [decoded_dir]```

Build with **output name**

```apktool b [decoded_dir] -o [output.apk]```

Decode **without resources**

```apktool d [app.apk] -r```

Decode **without sources**

```apktool d [app.apk] -s```

# SYNOPSIS

**apktool** _d_|_b_ [_options_] _apk_|_dir_

# DESCRIPTION

**apktool** is a reverse engineering tool for Android APK files. It decodes resources to nearly original form, allowing inspection and modification of manifests, layouts, and other XML resources. It also disassembles Dalvik bytecode to smali.

After modifications, apktool can rebuild the APK, which then needs to be signed before installation.

# PARAMETERS

**d**, **decode**
> Decode APK to directory

**b**, **build**
> Build APK from directory

**-o** _path_, **--output** _path_
> Output file/directory

**-r**, **--no-res**
> Don't decode resources

**-s**, **--no-src**
> Don't decode sources (smali)

**-f**, **--force**
> Force overwrite existing files

**--frame-path** _dir_
> Framework files directory

**-p** _dir_, **--frame-path** _dir_
> Store/load framework files

**--use-aapt2**
> Use aapt2 instead of aapt

# CONFIGURATION

**~/.local/share/apktool/framework/**
> Directory for stored framework files used during decoding and rebuilding.

# CAVEATS

Rebuilt APKs must be signed before installation. Some protection schemes may prevent successful decoding. Resource decoding may fail for heavily modified framework.

# HISTORY

**apktool** was created by Brut.all (Connor Tumbleson maintains the fork) and first released around **2010**. It became the standard tool for Android APK reverse engineering.

# SEE ALSO

[apksigner](/man/apksigner)(1), [jadx](/man/jadx)(1), [smali](/man/smali)(1)
