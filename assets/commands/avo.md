# TLDR

**Create** new test

```avo test [MyTest]```

**Generate** Go assembly

```avo generate```

**Build** with verification

```avo build```

Run **tests**

```avo test```

# SYNOPSIS

**avo** _command_ [_arguments_]

# DESCRIPTION

**avo** is a tool for generating x86-64 assembly code from Go. It provides a high-level interface for writing assembly while maintaining Go's type safety and tooling support.

The tool is particularly useful for optimizing performance-critical code paths while keeping the code maintainable and testable.

# PARAMETERS

**generate**
> Generate assembly from Go code

**build**
> Build and verify generated assembly

**test**
> Run assembly tests

**fmt**
> Format avo source files

**vet**
> Run verification checks

# FEATURES

- Type-safe assembly generation
- Automatic register allocation
- Integration with Go toolchain
- Test infrastructure
- Documentation generation
- Instruction validation

# CAVEATS

Requires understanding of assembly concepts. Generated code is architecture-specific (x86-64 only). Manual optimization may still be needed. Not all Go features can be represented in assembly.

# HISTORY

**avo** was created by Michael McLoughlin to make writing Go assembly more accessible and maintainable, first released around **2018**.

# SEE ALSO

[go](/man/go)(1), [objdump](/man/objdump)(1), [perf](/man/perf)(1)
