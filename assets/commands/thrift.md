# TLDR

**Generate code** for a specific language from a Thrift file

```thrift --gen [language] [file.thrift]```

**Generate code** in a specific output directory

```thrift --gen [language] -o [output_directory] [file.thrift]```

**Generate code** with language-specific options

```thrift --gen [language]:key1=val1,key2=val2 [file.thrift]```

**Generate code** including all referenced Thrift files

```thrift -r --gen [language] [file.thrift]```

**Add include search paths** for Thrift imports

```thrift -I [include_dir] --gen [language] [file.thrift]```

**List all available generators**

```thrift --help```

# SYNOPSIS

**thrift** [**-o** _dir_] [**-out** _dir_] [**-I** _dir_] [**-nowarn**] [**-strict**] [**-v**] [**-r**] [**-debug**] **--gen** _lang_[:_options_] _file.thrift_

# PARAMETERS

**--gen** _lang_[:_key=val,..._]
> Generate code with the specified generator. Language options can be passed as comma-separated key=value pairs.

**-o** _dir_
> Set the output directory for gen-* packages. Default is the current directory.

**-out** _dir_
> Set the output location directly without creating a gen-* folder.

**-I** _dir_
> Add a directory to search for include directives. Can be specified multiple times.

**-r**, **--recurse**
> Also generate code for included Thrift files recursively.

**-nowarn**
> Suppress all compiler warnings.

**-strict**
> Enable strict compiler warnings.

**-v**, **--verbose**
> Enable verbose output mode.

**-debug**
> Print parse debug trace to stdout.

**-version**
> Print the compiler version and exit.

# DESCRIPTION

**thrift** is the compiler for Apache Thrift, a framework for scalable cross-language services development. It combines a software stack with a code generation engine to build efficient and seamless services between languages like C++, Java, Python, PHP, Ruby, Erlang, Perl, Haskell, C#, JavaScript, Node.js, and more.

The compiler reads a Thrift Interface Definition Language (IDL) file containing struct and service definitions, then generates language-specific implementation code. This enables developers to define data types and service interfaces once and generate the boilerplate code for multiple programming languages.

Common generators include: **cpp**, **java**, **py**, **rb**, **php**, **js**, **go**, **rs** (Rust), **swift**, and many others. Run **thrift** without arguments to see all available generators for your installation.

# CAVEATS

Generated code structure and options vary significantly between language generators. Some generators may require additional runtime libraries to be installed. The **-nowarn** flag is generally discouraged as it can hide important compatibility issues.

# HISTORY

Apache Thrift was originally developed at **Facebook** in **2007** and was open-sourced in April **2008**. It became an Apache Incubator project in May 2008 and graduated to a top-level Apache project in **October 2010**. The framework was designed to enable efficient and reliable communication across programming languages at scale.

# SEE ALSO

[protoc](/man/protoc)(1), [grpc](/man/grpc)(1)
