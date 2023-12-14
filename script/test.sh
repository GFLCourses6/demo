RUN_FILE="test2.sh"

echo Hello World

echo "echo Hello world from second file" > ${RUN_FILE}
echo "java --version" >> ${RUN_FILE}
chmod a+x ${RUN_FILE}

./${RUN_FILE}
