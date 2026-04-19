# TAGLINE

displays vector data information

# TLDR

**List layers and summary of a data source**

```ogrinfo [file.shp]```

**Summary of a specific layer only (no features)**

```ogrinfo -so [file.shp] [layer_name]```

**Dump all layers and all features**

```ogrinfo -al [file.shp]```

**Show a single feature by FID**

```ogrinfo [file.shp] [layer_name] -fid [feature_id]```

**Filter features with a WHERE clause**

```ogrinfo -al -where "[field = 'value']" [file.shp]```

**Run an SQL query**

```ogrinfo [file.shp] -sql "[SELECT * FROM layer]"```

**Output as JSON**

```ogrinfo -json [file.shp]```

# SYNOPSIS

**ogrinfo** [_options_] _datasource_ [_layer_ ...]

# PARAMETERS

_DATASOURCE_
> OGR-supported vector data source (file, directory, connection string, URL).

_LAYER_
> One or more layer names to report on. If omitted with **-al**, all layers are reported.

**-al**
> List all features of all layers (opposite of **-so**).

**-so**
> Summary only: omit feature-by-feature reporting.

**-fl**
> Enable listing of features (opposite of **-so**).

**-json**
> Output the report in JSON format.

**-fid** _ID_
> Only report the feature with the given FID.

**-sql** _STATEMENT_
> Execute an SQL statement and return the result. Can also be a @filename reference.

**-dialect** _DIALECT_
> SQL dialect to use (e.g., OGRSQL, SQLITE).

**-where** _QUERY_
> Attribute filter applied to each layer.

**-spat** _xmin_ _ymin_ _xmax_ _ymax_
> Spatial filter: only features intersecting this bounding box are reported.

**-geom** _{YES|NO|SUMMARY|WKT|ISO_WKT}_
> How geometry is reported (default: YES).

**-limit** _N_
> Limit the number of features per layer.

**-if** _FORMAT_
> Force a specific driver when opening the input.

**-oo** _NAME=VALUE_
> Pass a dataset open option to the driver.

**-ro**
> Open the data source in read-only mode.

**-nomd**
> Suppress metadata printing.

**-listmdd**
> List all metadata domains available for the dataset.

**-mdd** _domain_
> Report metadata for the specified domain.

**--help**
> Display help information.

# DESCRIPTION

**ogrinfo** lists information about an OGR-supported vector data source to stdout. It reports layers, schema, coordinate reference system, extents, feature counts, and optionally the features themselves. By executing SQL statements via **-sql** it can also edit data in supported drivers.

# CAVEATS

Part of the GDAL suite. Format support depends on which OGR drivers were compiled into your GDAL build; check with `ogrinfo --formats`. Using **-al** on very large datasets can produce huge output.

# HISTORY

**ogrinfo** is distributed with **GDAL/OGR**, the open-source geospatial data library maintained by the **OSGeo** foundation. OGR originated as a separate library for vector data and was unified into GDAL in version 2.0.

# SEE ALSO

[ogr2ogr](/man/ogr2ogr)(1), [gdalinfo](/man/gdalinfo)(1)

