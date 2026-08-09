# TAGLINE

Classify arithmetic equality claims with independent proof checkers

# TLDR

**Check** whether an equality holds

```algebruh "[2 = 3]"```

**Prove** a claim from assumptions

```algebruh --assume "[a = c]" --assume "[c = b]" "[a = b]"```

**Compare** multiple interpretations (integers, reals, bit-vectors, modular)

```algebruh --interpret [int,real,bv8,mod:1] "[2 = 3]"```

**Declare** a function injective and check equality of arguments

```algebruh --injective [f] --assume "[f(a) = f(b)]" "[a = b]"```

**Run all checkers** and print a JSON report

```algebruh --all --json "[a = b]"```

**Emit** SMT-LIB and Z3 proof artifacts

```algebruh --emit [result] "[x + 0 = x]"```

**Check** which optional external solvers are available

```algebruh doctor```

# SYNOPSIS

**algebruh** [**--all**] [**--json**] [**--interpret** _LIST_] [**--assume** _EXPR_]... [**--injective** _NAME_]... [**--ai-command** _CMD_] [**--emit** _PREFIX_] _CLAIM_

**algebruh** **doctor** [**--json**]

# PARAMETERS

**--all**
> Run additional checkers (cvc5, Carcara, Lean/Mathlib, Vampire, E when available), extra solver seeds, and sufficient-premise search. Prints every attempt.

**--json**
> Print the complete report as JSON instead of human-readable text.

**--interpret** _LIST_
> Comma-separated interpretation list. Default is integers (**int**). Values include **int**, **real**, **bv**_N_ / **sbv**_N_ (signed N-bit, N=1..256), **ubv**_N_ (unsigned), **mod:**_N_, **quot:**_N_, **equiv:**_N_, **f32**, **f64**, and **singleton**. Integer is always evaluated as a baseline.

**--assume** _EXPR_
> Add an equality or disequality premise. May be repeated. Each assumption must contain exactly one **=**, **==**, or **!=**.

**--injective** _NAME_
> Declare a unary function name as injective. May be repeated. Other function applications remain uninterpreted.

**--ai-command** _CMD_
> Send the problem as JSON to _CMD_. The command's stdout must be a Lean tactic, which is accepted only after Lean kernel verification.

**--emit** _PREFIX_
> Write SMT-LIB (**_PREFIX_.smt2**) and Z3 proof (**_PREFIX_.proof**) when a selected Z3 proof is available. Does not overwrite existing files.

_CLAIM_
> Arithmetic equality or disequality to classify (for example **"2 = 3"** or **"a + 0 = a"**).

**doctor**
> Report availability of optional external tools on **PATH**. Exit code 1 if any listed tool is missing. Accepts **--json**.

# DESCRIPTION

**algebruh** classifies arithmetic equality and disequality claims. Given a claim and optional assumptions, it reports whether the claim is proved, refuted, contingent, vacuous, or unknown, and can surface disagreements between independent checkers.

The default path links against the Z3 library and independently checks candidates with exact evaluation, equality saturation, bounded model search, and LRAT replay when applicable. With **--all**, it also tries external tools found on **PATH** (cvc5, Carcara, Lean with Mathlib, Vampire, E). External tools run under Bubblewrap and **prlimit** where available.

Expressions support integers, variable names, unary applications such as **f(x)**, parentheses, unary minus, **+**, **-**, **\***, **/**, **%**, **=**, **==**, and **!=**. Multiplication, division, and modulo bind tighter than addition and subtraction. Each claim or assumption must contain one equality or disequality; comparisons such as **<** and **>=** are not supported.

Outcome labels include **PROVED**, **REFUTED** (exit 0), **CONTINGENT**, **CONDITIONAL**, **VACUOUS**, **UNKNOWN**, **UNSAFE_AXIOM**, **CHECKER_BUG_CANDIDATE** (exit 1), and **REINTERPRETED** when a non-integer interpretation proves a claim that integers do not (exit 0). Input, sandbox, and solver errors use exit code 2.

Build requires Rust 1.85+, Cargo, pkg-config, and Z3 development libraries (or the project's **nix-shell**). Install by building **target/release/algebruh** and placing it on **PATH**.

# CAVEATS

Nonlinear arithmetic may return **UNKNOWN**. Division and modulo by zero follow Z3 semantics. User-defined equality is limited to modular **equiv:**_N_. Optional checkers must be installed separately; **algebruh doctor** reports what is available. **--emit** never overwrites existing artifact files.

# HISTORY

Algebruh is a Rust CLI by Sebastian Korotkiewicz for cross-checking arithmetic claims with Z3 and optional independent solvers (cvc5, Lean, and others). Distributed as source from GitHub.

# SEE ALSO

[z3](/man/z3)(1), [cargo](/man/cargo)(1)

# RESOURCES

```[Source code](https://github.com/skorotkiewicz/algebruh)```

<!-- verified: 2026-08-09 -->
