# TLDR

**Clean build directory**

```gradle clean```

**Clean specific module**

```gradle :module:clean```

**Clean and build**

```gradle clean build```

# SYNOPSIS

**gradle clean** [_options_]

# PARAMETERS

**--info**
> Info logging.

**--help**
> Display help information.

# DESCRIPTION

**gradle clean** removes the build directory and all generated output. It deletes compiled classes, packaged artifacts, and cached build data.

The task ensures a fresh build by removing all artifacts from previous builds. It's useful when builds become inconsistent or caches are corrupted.

gradle clean removes build artifacts.

# CAVEATS

Removes all build output. Next build will be full rebuild. Doesn't clean dependencies.

# HISTORY

The clean task is a standard **Gradle** lifecycle task for build artifact removal.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-build](/man/gradle-build)(1)
