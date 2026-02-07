# TAGLINE

Gradle build artifact removal task

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

**gradle clean** removes the build directory and all generated output. It deletes compiled classes, packaged artifacts, and cached build data, ensuring a fresh build environment.

The task is useful when builds become inconsistent or caches are corrupted, forcing a complete rebuild on the next invocation.

# CAVEATS

Removes all build output. Next build will be full rebuild. Doesn't clean dependencies.

# HISTORY

The clean task is a standard **Gradle** lifecycle task for build artifact removal.

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-build](/man/gradle-build)(1)
