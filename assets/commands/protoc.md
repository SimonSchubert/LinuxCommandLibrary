# TAGLINE

Protocol Buffers compiler and code generator

# TLDR

**Generate Python code** from a .proto file

```protoc --python_out=[path/to/output_directory] [input_file.proto]```
  
**Generate Java code** from a .proto file that imports other .proto files

```protoc --java_out=[path/to/output_directory] --proto_path=[path/to/import_search_path] [input_file.proto]```
  
**Generate code for multiple languages**

```protoc --csharp_out=[path/to/c#_output_directory] --js_out=[path/to/js_output_directory] [input_file.proto]```

**Encode** a text-format message into a **protocol message** from a .proto file

```protoc < [message.txt] --encode=[TypeName] [input_file.proto]```

**Decode a protocol message** into text-format from a .proto file

```protoc < [message.bin] --decode=[TypeName] [input_file.proto]```

**Decode a protocol message** into raw tag/value pairs

```protoc < [message.bin] --decode_raw```

# SYNOPSIS

**protoc**  [**--cpp_out=**_OUT_DIR_] [**--java_out=**_OUT_DIR_] [**--python_out=**_OUT_DIR_] [**-I**_PATH_  |  **--proto_path=**_PATH_]  _PROTO_FILE_

# DESCRIPTION

**protoc** is the official compiler for Google's Protocol Buffers, a language-neutral serialization framework. It reads **.proto** definition files that describe structured data formats and generates language-specific source code for serializing and deserializing that data efficiently in C++, Java, Python, Go, and many other languages through plugins.

The compiler resolves imports between .proto files using search paths specified with **-I** (or **--proto_path**), and can generate code for multiple target languages in a single invocation. It also supports encoding and decoding protocol buffer messages on the command line for debugging and testing purposes.

protoc is a core component of the gRPC ecosystem, where .proto files define both data structures and service interfaces for remote procedure calls.

# OPTIONS

**-I**_PATH_,  **--proto_path=**_PATH_

> Specify the directory in which to search for imports. May be specified multiple times; directories will be searched in order. If not given, the current working directory is used.

**--cpp_out=**_OUT_DIR_

> Enable generation of C++ bindings and store them in  _OUT_DIR_.

**--java_out=**_OUT_DIR_

> Enable generation of Java bindings and store them in  _OUT_DIR_.

**--python_out=**_OUT_DIR_

> Enable generation of Python bindings and store them in  _OUT_DIR_.

**-h**,  **--help**

> Show summary of options.

**--version**

> Show version of program.

Note that at least one of the  **--cpp_out**,  **--java_out**  and  **--python_out**  options must be given (otherwise the program has nothing to do). Its also possible to specify more than one.

# CAVEAT

Finicky path resolution: it demands precise --proto_path (-I) flags for all .proto files and imports, often failing with "file not found" errors if paths aren't exactly matched (no smart relative/absolute equivalence). Always run from the proto root dir, include parent paths in -I, and consider wrappers like Buf for easier handling.

# HISTORY

Initially developed internally at **Google in 2001** as a way to handle structured data serialization more efficiently than XML, with the first public release occurring in **2008** under an open-source license. The protoc compiler itself evolved alongside, starting as a C++-based tool and expanding to support multiple languages like Java, Python, and Go through generated code stubs. Over the years, it has seen continuous updates, with version 3 introducing significant syntax changes in **2016** and recent iterations up to **2026 focusing** on performance optimizations, nanoPB for embedded systems, and better integration with gRPC.

# SEE ALSO

[buff](/man/buff)(1)
