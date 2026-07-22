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

**clean**_TaskName_
> Task rule that deletes only the outputs of a named task, e.g. `cleanJar` removes the JAR produced by the `jar` task.

**--info**
> Info logging.

**--help**
> Display help information.

# DESCRIPTION

**gradle clean** deletes the project build directory (the path set by `layout.buildDirectory`, by default `build/`) and everything in it. It removes compiled classes, packaged artifacts, and cached build output, ensuring a fresh build environment.

The task is provided by Gradle's base plugin, which is applied by the Java, Application, and most other language plugins. It is useful when builds become inconsistent or caches are corrupted, forcing a complete rebuild on the next invocation.

# CAVEATS

Removes all build output. Next build will be full rebuild. Doesn't clean dependencies.

# HISTORY

The clean task is a standard **Gradle** lifecycle task for build artifact removal.

# INSTALL

```pacman: sudo pacman -S gradle```

```apk: sudo apk add gradle```

```brew: brew install gradle```

```nix: nix profile install nixpkgs#gradle```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-build](/man/gradle-build)(1)
