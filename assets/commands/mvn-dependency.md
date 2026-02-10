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

**Show effective POM**

```mvn dependency:resolve -Dverbose```

**Filter by scope**

```mvn dependency:tree -Dscope=[compile]```

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
> Resolve dependencies.

**-Dscope** _SCOPE_
> Filter by scope.

**--help**
> Display help information.

# DESCRIPTION

**mvn dependency** goals manage Maven dependencies. They analyze and display project dependencies.

The plugin shows dependency tree. Helps identify conflicts and unused dependencies.

# CAVEATS

Part of Maven. Requires pom.xml. Network access for resolution.

# HISTORY

The Maven Dependency Plugin is part of **Apache Maven**, providing dependency analysis since early Maven versions.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-deploy](/man/mvn-deploy)(1), [gradle](/man/gradle)(1)

