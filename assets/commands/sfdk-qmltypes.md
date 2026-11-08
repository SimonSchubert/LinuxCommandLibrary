# TAGLINE

Generate qmltypes files on a Sailfish emulator

# TLDR

**Update all qmltypes files known to Git**

```sfdk qmltypes```

**Skip deploying the locally built packages**

```sfdk qmltypes --no-deploy```

**Leave the emulator in its modified state**

```sfdk qmltypes --no-restore-emulator```

**Restore the emulator after a failed run**

```sfdk qmltypes --restore-emulator```

# SYNOPSIS

**sfdk qmltypes** [**--no-deploy**] [**--no-keep**] [**--no-restore-emulator**] [**--restore-emulator**]

# PARAMETERS

**--no-deploy**
> Do not deploy the locally built packages to the emulator.

**--no-keep**
> Do not automatically revert removal of statements marked with the **sdk-make-qmltypes:keep** directive.

**--no-restore-emulator**
> Do not restore the emulator to its original state after a successful run.

**--restore-emulator**
> Manually restore the emulator left in a modified state by an earlier failure.

# DESCRIPTION

**sfdk qmltypes** generates qmltypes files with **qmlplugindump** executed on a Sailfish OS Emulator, because running it in the build environment is not always possible. It deploys the locally built packages and restores the emulator when finished. Part of the Sailfish SDK command-line tool.

The tool relies on a convention: every qmltypes file known to Git can be updated by running **make qmltypes** in its directory. New files must be created empty and added to the Git index first.

# CAVEATS

**qmlplugindump** can produce incomplete results for some QML modules. Mark manual additions with an **sdk-make-qmltypes:keep** comment immediately before each statement. On failure, the emulator is left in the modified state.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-qmake](/man/sfdk-qmake)(1), [sfdk-emulator](/man/sfdk-emulator)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
