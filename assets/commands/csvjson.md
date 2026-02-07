# TAGLINE

CSV to JSON converter

# TLDR

**Convert CSV to JSON** array

```csvjson [data.csv]```

**Convert with indentation** for readability

```csvjson -i [4] [data.csv]```

**Convert to newline-delimited JSON** (one object per line)

```csvjson --stream [data.csv]```

**Use a column as key** for object output

```csvjson -k [id] [data.csv]```

**Convert to GeoJSON** from lat/lon columns

```csvjson --lat [latitude] --lon [longitude] [data.csv]```

**Convert with custom delimiter**

```csvjson -d "[;]" [data.csv]```

# SYNOPSIS

**csvjson** [_options_] _file_

# PARAMETERS

_FILE_
> CSV file to convert. Uses stdin if not specified.

**-i** _N_, **--indent** _N_
> Indentation level for pretty printing.

**-k** _COLUMN_, **--key** _COLUMN_
> Column to use as object keys (creates object instead of array).

**--stream**
> Output newline-delimited JSON (one object per line).

**--lat** _COLUMN_
> Latitude column for GeoJSON output.

**--lon** _COLUMN_
> Longitude column for GeoJSON output.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**--no-inference**
> Disable type inference (keep all values as strings).

# DESCRIPTION

**csvjson** is part of csvkit that converts CSV files to JSON format. It supports various output formats including JSON arrays, keyed objects, newline-delimited JSON for streaming, and GeoJSON for geographic data.

By default, output is a JSON array of objects where each row becomes an object with column names as keys. The **-k** option creates a keyed object using a unique column's values as keys.

Type inference converts numeric and boolean values appropriately. The streaming mode outputs one JSON object per line, suitable for processing with tools like jq or for large files that shouldn't be loaded entirely.

# CAVEATS

The **-k** option requires unique values in the key column. Large files may use significant memory without streaming mode. GeoJSON output requires valid latitude/longitude values. Type inference may misinterpret some values.

# HISTORY

csvjson is part of **csvkit**, created by Christopher Groskopf in **2011**. It enables easy conversion of tabular data to JSON, the dominant format for web APIs and JavaScript applications.

# SEE ALSO

[in2csv](/man/in2csv)(1), [jq](/man/jq)(1), [csvkit](/man/csvkit)(1), [miller](/man/miller)(1)
