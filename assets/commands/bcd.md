# TAGLINE

Convert between binary, decimal, and hexadecimal

# TLDR

**Convert decimal to binary and hex**

```bcd [42]```

**Convert binary to decimal and hex**

```bcd [0b101010]```

**Convert hexadecimal to decimal and binary**

```bcd [0x2A]```

**Convert multiple numbers**

```bcd [255] [0xFF] [0b11111111]```

# SYNOPSIS

**bcd** _number_ [_number_...]

# DESCRIPTION

**bcd** is an arbitrary-precision base converter that automatically converts between binary, decimal, and hexadecimal number formats. It detects the input base and displays the value in all three formats.

Useful for programmers, system administrators, and anyone working with different number representations in networking, hardware debugging, or reverse engineering.

# INPUT FORMATS

**Decimal**
> Plain numbers (e.g., 42, 255)

**Binary**
> Prefix with 0b (e.g., 0b101010)

**Hexadecimal**
> Prefix with 0x (e.g., 0xFF, 0x2A)

# CAVEATS

Only handles integer numbers. Does not support floating-point values or complex mathematical operations. For general calculations, use bc instead.

# SEE ALSO

[bc](/man/bc)(1), [printf](/man/printf)(1), [dc](/man/dc)(1)
