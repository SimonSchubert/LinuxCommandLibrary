# TAGLINE

localized fake data generation library CLI

# TLDR

**Generate fake name**

```faker name```

**Generate fake email**

```faker email```

**Generate with locale**

```faker -l [de_DE] address```

**Multiple outputs**

```faker -r [10] name```

**Generate specific type**

```faker phone_number```

# SYNOPSIS

**faker** [_options_] _provider_ [_method_]

# PARAMETERS

_PROVIDER_
> Data provider: name, address, email, phone_number, etc.

**-l** _LOCALE_, **--locale** _LOCALE_
> Locale for generated data (e.g., en_US, de_DE, ja_JP).

**-r** _COUNT_, **--repeat** _COUNT_
> Number of values to generate.

**-s** _SEED_, **--seed** _SEED_
> Random seed for reproducibility.

**-o** _FORMAT_, **--output** _FORMAT_
> Output format: csv, json, tab.

**--help**
> Display help information.

# DESCRIPTION

**faker** is a command-line tool for generating fake data like names, addresses, emails, and phone numbers. It's part of the Faker Python library and supports localized data for many countries.

The tool provides numerous data providers covering personal information, company details, internet data, dates, and more. Localization ensures generated data matches regional formats and naming conventions.

faker is widely used for testing, database seeding, and development when realistic but non-sensitive data is needed.

# CAVEATS

Generated data may accidentally match real information. Quality varies by locale. Some providers may be incomplete for certain regions.

# HISTORY

Faker originated as a **PHP library** inspired by Perl's Data::Faker. The Python version by **joke2k** became widely popular, providing the faker CLI and extensive provider ecosystem for test data generation.

# SEE ALSO

[python](/man/python)(1), [mimesis](/man/mimesis)(1)
