# TAGLINE

runs source code generation plugins

# TLDR

**Generate sources**

```mvn generate-sources```

**Generate with profile**

```mvn generate-sources -P [profile]```

**Generate offline**

```mvn generate-sources -o```

**Generate only for one module** and the modules it depends on

```mvn generate-sources -pl [module] -am```

**Run quietly**, showing only errors

```mvn -q generate-sources```

# SYNOPSIS

**mvn generate-sources** [_options_]

# PARAMETERS

**-P** _profile_[,_profile_...]
> Activate one or more build profiles defined in **pom.xml** or **settings.xml**.

**-o**, **--offline**
> Work offline (do not contact remote repositories).

**-U**, **--update-snapshots**
> Force a check for updated SNAPSHOT dependencies and plugin releases.

**-X**, **--debug**
> Enable debug-level Maven output.

**-pl** _modules_, **--projects** _modules_
> Restrict the build to the listed reactor modules (comma-separated).

**-am**, **--also-make**
> Build also the projects required by the ones selected with **-pl**.

**-T** _N_[**C**], **--threads** _N_[**C**]
> Use _N_ threads, optionally per CPU core (e.g. **-T 1C**).

**-D**_property_=_value_
> Pass a system property to the build.

# DESCRIPTION

**mvn generate-sources** invokes Maven's **generate-sources** lifecycle phase, which (along with all earlier phases: **validate**, **initialize**) runs any plugin executions bound to it. This is where code generators belong: JAXB / XJC, gRPC / Protocol Buffers, Avro, Antlr, OpenAPI, Modello, JOOQ, etc. Generated sources usually land under **target/generated-sources/**_plugin_/ and are added to the compile source roots automatically when the next phase, **process-sources**, and then **compile**, run.

Because Maven runs every preceding phase as well, **mvn generate-sources** is rarely the most useful command on its own: most users invoke **mvn compile** or **mvn package** and let generation happen as a side effect. Use this phase explicitly when you want generated code available for IDE refresh without compiling the whole project.

# CAVEATS

Generated sources are wiped by **mvn clean**. Plugins must be bound to **generate-sources** in **pom.xml** or activated by a profile; otherwise nothing happens. Multiple plugins generating into the same root can collide.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-compile](/man/mvn-compile)(1), [mvn-package](/man/mvn-package)(1), [mvn-dependency](/man/mvn-dependency)(1)

# RESOURCES

```[Source code](https://github.com/apache/maven)```

```[Homepage](https://maven.apache.org)```

```[Documentation](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)```

<!-- verified: 2026-11-23 -->
