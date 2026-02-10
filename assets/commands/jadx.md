# TAGLINE

decompiles Android DEX bytecode to Java source

# TLDR

**Decompile APK**

```jadx [app.apk]```

**Decompile to specific directory**

```jadx -d [output_dir] [app.apk]```

**Open GUI**

```jadx-gui [app.apk]```

**Decompile DEX file**

```jadx [classes.dex]```

**Show decompilation info**

```jadx --show-bad-code [app.apk]```

**Export as Gradle project**

```jadx -e [output_dir] [app.apk]```

# SYNOPSIS

**jadx** [_options_] _file_

# PARAMETERS

_FILE_
> APK, DEX, or AAR file to decompile.

**-d** _DIR_
> Output directory.

**-e** _DIR_
> Export as Gradle project.

**--show-bad-code**
> Show decompilation errors in output.

**-r**, **--no-res**
> Skip resources decompilation.

**-j** _N_
> Thread count.

**--help**
> Display help information.

# DESCRIPTION

**jadx** decompiles Android DEX bytecode to Java source. It processes APK files directly including resources.

The tool provides both CLI and GUI interfaces. It produces readable Java code from compiled Android apps.

# CAVEATS

Decompilation not perfect. Obfuscated code harder. Legal considerations apply.

# HISTORY

jadx was created as an improvement over older Android decompilers, focusing on producing cleaner, more readable Java output.

# SEE ALSO

[apktool](/man/apktool)(1), [dex2jar](/man/dex2jar)(1), [jd-cli](/man/jd-cli)(1)
