# Author: Megan Zhang
# PID: 730237266
# I pledge the UNC and COMP290 Honor Code.

.PHONY: run clean dirs

bin/stack-demo: | obj/stack.o obj/main.o
	gcc -g -Wall -std=c11 -o bin/stack-demo obj/stack.o obj/main.o

dirs: obj/ bin/

%/:
	mkdir $@

obj/%.o: | obj/ bin/
	gcc -g -Wall -std=c11 -c -o obj/$*.o src/$*.c

run: bin/stack-demo
	./bin/stack-demo

clean:
	rm -rf obj/ bin/
