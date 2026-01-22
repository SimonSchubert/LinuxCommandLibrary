# TLDR

**Run default target**

```phing```

**Run specific target**

```phing [target]```

**Use custom build file**

```phing -f [build.xml] [target]```

**List targets**

```phing -l```

**Set property**

```phing -D[name]=[value] [target]```

# SYNOPSIS

**phing** [_options_] [_target_...]

# PARAMETERS

_TARGET_
> Build target to execute.

**-f** _FILE_
> Build file.

**-l**
> List targets.

**-D**_PROP_**=**_VALUE_
> Set property.

**-v**
> Verbose output.

**-q**
> Quiet mode.

# DESCRIPTION

**phing** is PHP build tool. Port of Apache Ant to PHP.

The tool automates PHP builds. XML-based configuration.

phing builds PHP projects.

# CAVEATS

Requires PHP. XML build files. Ant-like syntax.

# HISTORY

Phing (PHing Is Not GNU make) is a **PHP port of Apache Ant**.

# SEE ALSO

[ant](/man/ant)(1), [make](/man/make)(1), [composer](/man/composer)(1)

