require recipes-core/images/nmrouter-image.bb

SUMMARY = "nmrouter image with some additional tools"

IMAGE_INSTALL_append = " \
                i2ctool \
                rs485 \
                "

