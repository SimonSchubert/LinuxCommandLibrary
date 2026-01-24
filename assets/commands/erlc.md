# TLDR

**Compile Erlang module**

```erlc [module.erl]```

**Compile to specific directory**

```erlc -o [ebin] [module.erl]```

**Compile with debug info**

```erlc +debug_info [module.erl]```

**Include header directory**

```erlc -I [include] [module.erl]```

**Compile multiple files**

```erlc [*.erl]```

**Show warnings as errors**

```erlc -Werror [module.erl]```

# SYNOPSIS

**erlc** [_options_] _files_...

# DESCRIPTION

**erlc** is the Erlang compiler, converting Erlang source files (.erl) to BEAM bytecode (.beam). It's the standard way to compile Erlang modules.

The compiler supports various options for optimization, debugging, and include paths. It's typically invoked through build tools like rebar3 but can be used directly.

# PARAMETERS

**-o** _directory_
> Output directory for compiled files.

**-I** _directory_
> Add include directory.

**-D** _name[=value]_
> Define macro.

**-W** _level_
> Warning level.

**-Werror**
> Treat warnings as errors.

**+debug_info**
> Include debug information.

**+native**
> Native code compilation (HiPE).

**-b** _type_
> Output type (beam, asm, etc.).

**-v**
> Verbose output.

**-pa** _path_
> Add code path.

# CAVEATS

Requires Erlang/OTP installed. Native compilation deprecated in OTP 24+. Include paths must be specified explicitly. Module name must match filename.

# HISTORY

**erlc** has been part of **Erlang/OTP** since its early releases. Erlang was developed at **Ericsson** by **Joe Armstrong** and others starting in **1986**, released as open source in **1998**. The compiler generates BEAM bytecode for the Erlang virtual machine.

# SEE ALSO

[erl](/man/erl)(1), [rebar3](/man/rebar3)(1), [dialyzer](/man/dialyzer)(1), [escript](/man/escript)(1)
