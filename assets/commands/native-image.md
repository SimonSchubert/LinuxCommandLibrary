# TLDR

**Compile Java to native executable**

```native-image -jar [app.jar]```

**Compile with specific output name**

```native-image -jar [app.jar] -o [myapp]```

**Run JavaScript file**

```js [script.js]```

**Run Python file**

```graalpy [script.py]```

**Install additional language**

```gu install [python]```

**List installed components**

```gu list```

**Show GraalVM version**

```java -version```

**Compile with build report**

```native-image --diagnostics-mode -jar [app.jar]```

# SYNOPSIS

**native-image** [_options_] _class_|_-jar jarfile_

**gu** _command_ [_options_] [_component_]

**js** [_options_] [_file_]

**graalpy** [_options_] [_file_]

# NATIVE-IMAGE OPTIONS

**-o** _name_
> Output file name.

**-jar** _file_
> Input JAR file.

**--no-fallback**
> Build native-only image (no JVM fallback).

**--static**
> Build fully static executable.

**-H:Name=**_name_
> Native image name.

**-H:+ReportExceptionStackTraces**
> Enable stack traces.

**--initialize-at-build-time**
> Initialize classes at build time.

**--initialize-at-run-time=**_classes_
> Initialize classes at runtime.

**-H:ReflectionConfigurationFiles=**_file_
> Reflection configuration.

**--diagnostics-mode**
> Generate diagnostic information.

**--verbose**
> Verbose output.

# GU COMMANDS

**install** _component_
> Install GraalVM component.

**remove** _component_
> Remove component.

**list**
> List installed components.

**available**
> List available components.

**update**
> Update installed components.

**rebuild-images**
> Rebuild native launchers.

# DESCRIPTION

**GraalVM** is a high-performance JDK with ahead-of-time native compilation and polyglot support. It runs Java, JavaScript, Python, Ruby, R, and LLVM-based languages.

**native-image** compiles Java applications to native executables. Benefits include instant startup, reduced memory, and no JVM dependency. Requires closed-world analysis—all code paths must be known at build time.

Reflection, dynamic proxies, and resources need configuration files. Use the tracing agent: **java -agentlib:native-image-agent=config-output-dir=conf -jar app.jar** to generate them.

**gu** (GraalVM Updater) manages optional components. Install language runtimes like Python (**graalpy**), Ruby (**truffleruby**), or LLVM toolchain.

GraalVM's Truffle framework enables high-performance language implementations. Languages can interoperate—call JavaScript from Java or vice versa.

# CAVEATS

Native image build is resource-intensive. Some Java features require explicit configuration. Not all libraries support native compilation. Build time significantly longer than JVM startup.

# HISTORY

GraalVM was developed at **Oracle Labs**, based on research into dynamic compilation. First released in **2018** as version 1.0. The Graal compiler originated from the Maxine VM project. GraalVM CE (Community Edition) is open source; Enterprise Edition adds optimizations. Native Image became production-ready in GraalVM 21. The project enables cloud-native Java with frameworks like Quarkus and Micronaut.

# SEE ALSO

[java](/man/java)(1), [javac](/man/javac)(1), [quarkus](/man/quarkus)(1), [micronaut](/man/micronaut)(1)
