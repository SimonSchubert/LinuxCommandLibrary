# TAGLINE

Random knowledge tests from BSD games

# TLDR

**List available subjects**

```quiz```

**Ask questions from one category, answer from another**

```quiz [victim] [killer]```

**Use tutorial mode**, repeating missed questions

```quiz -t [victim] [killer]```

**Use an alternative index file**

```quiz -i [path/to/index] [category1] [category2]```

# SYNOPSIS

**quiz** [**-t**] [**-i** _file_] [_category1_ _category2_]

# PARAMETERS

_category1_ _category2_
> Two categories from the same subject: questions come from the first, answers are expected from the second.

**-t**
> Tutorial mode: missed questions are repeated later and new questions appear less often.

**-i** _file_
> Use an alternative index file.

# DESCRIPTION

**quiz** tests knowledge of random facts from a database of subjects. Run without arguments, it lists the available subjects.

Each subject is divided into categories, and any two from the same subject can be chosen. For example, **quiz victim killer** asks for the killer of each victim, while **quiz killer victim** works the other way around. After a wrong answer you can try again; entering a blank line shows the right answer.

# CAVEATS

Part of bsdgames. Both categories must belong to the same subject.

# HISTORY

quiz is a **BSD games** educational utility.

# SEE ALSO

[bsdgames](/man/bsdgames)(6), [arithmetic](/man/arithmetic)(6)

# RESOURCES

```[Source code](https://github.com/NetBSD/src/tree/trunk/games/quiz)```

```[Documentation](https://man.openbsd.org/quiz.6)```

<!-- verified: 2026-11-08 -->
