# TAGLINE

goals manage Maven dependencies

# TLDR

**Show dependency tree**

```mvn dependency:tree```

**Analyze dependencies**

```mvn dependency:analyze```

**List dependencies**

```mvn dependency:list```

**Copy dependencies**

```mvn dependency:copy-dependencies```

**Resolve dependencies**

```mvn dependency:resolve```

**Verbose tree** showing conflict resolution

```mvn dependency:tree -Dverbose```

**Filter tree by scope**

```mvn dependency:tree -Dscope=[compile]```

**Purge local copies** and re-resolve

```mvn dependency:purge-local-repository```

# SYNOPSIS

**mvn** **dependency:**_goal_ [_options_]

# PARAMETERS

_GOAL_
> Dependency plugin goal.

**tree**
> Display dependency tree.

**analyze**
> Analyze used/unused deps.

**list**
> List all dependencies.

**copy-dependencies**
> Copy deps to target.

**resolve**
> Resolve and download all dependencies to the local repository.

**purge-local-repository**
> Remove project dependencies from the local repository and optionally re-resolve them.

**-Dscope** _SCOPE_
> Filter by dependency scope (compile, runtime, test, provided, system).

**-Dincludes** _PATTERN_
> Filter output to matching artifacts (groupId:artifactId:type:version pattern, supports wildcards).

**-DoutputFile** _FILE_
> Write output to a file instead of stdout (supported by tree, list, resolve).

# DESCRIPTION

The **maven-dependency-plugin** provides goals for analyzing, listing, copying, and resolving Maven project dependencies. The **tree** goal is the most commonly used, displaying the full transitive dependency tree with conflict resolution details when **-Dverbose** is enabled. The **analyze** goal identifies dependencies that are declared but unused, or used but not explicitly declared.

# CAVEATS

Requires a valid **pom.xml**. Network access is needed for initial resolution. The **analyze** goal cannot detect dependencies used only via reflection.

# HISTORY

The Maven Dependency Plugin is part of **Apache Maven**, providing dependency analysis since early Maven versions.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-deploy](/man/mvn-deploy)(1), [gradle](/man/gradle)(1)

