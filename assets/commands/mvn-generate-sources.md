# TAGLINE

runs source code generation plugins

# TLDR

**Generate sources**

```mvn generate-sources```

**Generate with profile**

```mvn generate-sources -P [profile]```

**Generate offline**

```mvn generate-sources -o```

# SYNOPSIS

**mvn generate-sources** [_options_]

# PARAMETERS

**-P** _profile_
> Activate profile.

**-o**
> Work offline.

**-X**
> Debug mode.

# DESCRIPTION

**mvn generate-sources** runs source code generation plugins. Executes generate-sources phase of Maven lifecycle. Plugins can generate code from schemas, specs, or other sources into target/generated-sources.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-compile](/man/mvn-compile)(1)

