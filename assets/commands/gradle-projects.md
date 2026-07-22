# TAGLINE

Gradle subproject hierarchy viewer

# TLDR

**List all subprojects**

```gradle projects```

**List with wrapper**

```./gradlew projects```

**List for specific project**

```gradle :[subproject]:projects```

# SYNOPSIS

**gradle** **projects**

# DESCRIPTION

**gradle projects** displays a hierarchical list of all subprojects in a multi-project Gradle build. The output shows the root project and all its subprojects with their paths, helping navigate complex builds with multiple modules.

# INSTALL

```pacman: sudo pacman -S gradle```

```apk: sudo apk add gradle```

```brew: brew install gradle```

```nix: nix profile install nixpkgs#gradle```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gradle](/man/gradle)(1), [gradle-tasks](/man/gradle-tasks)(1)

# RESOURCES

```[Documentation](https://docs.gradle.org/current/userguide/command_line_interface.html)```

<!-- verified: 2026-07-17 -->
